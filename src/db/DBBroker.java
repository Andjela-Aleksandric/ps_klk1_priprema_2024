/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import domain.Angazovanje;
import domain.Predmet;
import domain.Profesor;
import domain.Zvanje;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Anđela
 */
public class DBBroker {
    private Connection conn;

    public DBBroker() {
        conn = Konekcija.getKonekcija().getConn();
    }

    public List<Predmet> getListaPredmeta() throws Exception {
        List<Predmet> lista = new ArrayList<>();
        try {
            String upit = "SELECT * FROM predmet";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(upit);
            while(rs.next()){
                lista.add(new Predmet(rs.getLong("id"), rs.getString("naziv"), rs.getString("kod"), rs.getInt("espb")));
            }
            
        } catch (Exception ex) {
            throw new Exception("Neuspesno ucitana lista predmeta iz baze");
        }
        return lista;
     }

    public List<Profesor> getListaProfesora() throws Exception {
        List<Profesor> lista = new ArrayList<>();
        try {
            String upit = "SELECT * FROM profesor";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(upit);
            while(rs.next()){
                lista.add(new Profesor(rs.getLong("id"), rs.getString("ime"), rs.getString("prezime"), rs.getString("email"), Zvanje.valueOf(rs.getString("zvanje"))));
            }
            
        } catch (Exception ex) {
            throw new Exception("Neuspesno ucitana lista profesora iz baze");
        }
        return lista;
    }

    public void sacuvajProfesora(Profesor profesor) throws Exception {
       if(postojiProfesor(profesor.getEmail())){
           throw new Exception("Profesor vec postoji u bazi");
       }
        try {
            String upit = "INSERT INTO profesor(ime,prezime,email,zvanje) VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(upit, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, profesor.getIme());
            ps.setString(2, profesor.getPrezime());
            ps.setString(3, profesor.getEmail());
            ps.setString(4, String.valueOf(profesor.getZvanje()));
            ps.executeUpdate();
            conn.commit();
        } catch (Exception ex) {
            throw new Exception("Neuspesno sacuvan profesor u bazu");
        }
        
    }
    
    public boolean postojiProfesor(String email){
        try {
            String upit = "SELECT * FROM profesor WHERE email = ?";
            PreparedStatement ps = conn.prepareStatement(upit);
            ps.setString(1,email);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            return false;
        } catch (Exception ex) {
        }
        return false;
    }
    
    public void sacuvajAngazovanje(Long idProf, Long idP) throws Exception{
        if(max3Ang(idProf)){
            throw new Exception("Profesor ima maksimalan broj angazovanja (3)");
        }
        if(postojiAngazovanje(idProf, idP)){
            throw new Exception("Angazovanje vec postoji u bazi");
        }
        try {
            String upit = "INSERT INTO angazovanje(profesor, predmet) VALUES (?,?)";
            PreparedStatement ps = conn.prepareStatement(upit, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1,idProf);
            ps.setLong(2,idP);
            ps.executeUpdate();
            conn.commit();
        } catch (Exception ex) {
            throw new Exception("Neuspesno sacuvano angazovanje u bazu");
        }
    }

    public List<Angazovanje> vratiAngazovanja(Profesor p) throws Exception {
        List<Angazovanje> lista = new ArrayList<>();
        try {
            String upit = "SELECT * FROM angazovanje a JOIN profesor prof ON a.profesor = prof.id JOIN predmet p ON p.id = a.predmet WHERE profesor = " + p.getId();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(upit);
            while(rs.next()){
                
                lista.add(new Angazovanje(rs.getLong("a.id"), new Profesor(rs.getLong("prof.id"), rs.getString("prof.ime"), rs.getString("prof.prezime"), rs.getString("prof.email"), Zvanje.valueOf(rs.getString("prof.zvanje"))), new Predmet(rs.getLong("p.id"), rs.getString("p.naziv"), rs.getString("p.kod"), rs.getInt("p.espb"))));
            }
            
        } catch (Exception ex) {
            throw new Exception("Neuspesno ucitana lista angazovanja iz baze");
        }
        return lista;
    }
    
    public boolean postojiAngazovanje(Long idprof, Long idpredmet) throws Exception{
        
        String upit = "SELECT * FROM angazovanje a WHERE profesor = " + idprof + " AND predmet = " + idpredmet;
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(upit);
            if(rs.next()){
                return true;
            }
        } catch (Exception ex) {
            throw new Exception("Angazovanje vec postoji u bazi");
        }
        return false;
    }

    public boolean max3Ang(Long idProf){
        String upit = "SELECT COUNT(*) AS BROJ FROM angazovanje WHERE profesor = " + idProf;
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(upit);
            if(rs.next()){
                int broj = rs.getInt("broj");
                if(broj >= 3){
                    return true;
                }
            }
            return false;
        } catch (Exception ex) {
            
        }
        return false;
    }

    public void obrisiAngazovanje(Angazovanje a) throws Exception {
        String upit = "delete from angazovanje where id = " + a.getId();
        try {
            conn.createStatement().executeUpdate(upit);
            conn.commit();
        } catch (SQLException ex) {
            throw new Exception("Neuspesno brisanje angazovanja");
        }
    }
    
}
