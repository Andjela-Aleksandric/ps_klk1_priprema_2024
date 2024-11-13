/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import db.DBBroker;
import domain.*;
import java.util.List;
import repository.KorisnikRep;

/**
 *
 * @author Anđela
 */
public class Controller {
    private DBBroker dbb;
    private static Controller controller;
    private final KorisnikRep kr;
    private Korisnik ulogovani;
    private Controller(){
        dbb = new DBBroker();
        kr = new KorisnikRep();
        
    }
    
    public static Controller getController(){
        if(controller == null){
            controller = new Controller();
        }
        return controller;
    }

    public Korisnik getUlogovani() {
        return ulogovani;
    }

    public void setUlogovani(Korisnik ulogovani) {
        this.ulogovani = ulogovani;
    }
    
    public boolean postojiKorisnik(String email, String pass){
        for(Korisnik k : kr.getLista()){
            if(k.getEmail().equals(email) && k.getLozinka().equals(pass)){
                this.ulogovani = k;
                return true;
            }
        }
        return false;
    }
    
    public List<Predmet> getListaPredmeta() throws Exception {
        try {
            return dbb.getListaPredmeta();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Profesor> getListaProfesora() throws Exception {
        try {
            return dbb.getListaProfesora();
        } catch (Exception e) {
            throw e;
        }
    }

    public void sacuvajProfesora(Profesor profesor) throws Exception {
        try {
            dbb.sacuvajProfesora(profesor);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Angazovanje> vratiAngazovanja(Profesor p) throws Exception {
        try {
           return dbb.vratiAngazovanja(p);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public boolean postojiAngazovanje(Long idprof, Long idpredmet) throws Exception{
        try {
           return dbb.postojiAngazovanje(idprof,idpredmet);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void sacuvajAngazovanje(Long idProf, Long idP) throws Exception{
        try {
           dbb.sacuvajAngazovanje(idProf,idP);
        } catch (Exception e) {
            throw e;
        }
    }

    public void obrisiAngazovanje(Angazovanje a) throws Exception {
        try {
           dbb.obrisiAngazovanje(a);
        } catch (Exception e) {
            throw e;
        }
    }
}
