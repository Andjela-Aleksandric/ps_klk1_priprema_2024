/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import domain.Korisnik;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Anđela
 */
public class KorisnikRep {
    private List<Korisnik> lista;

    public KorisnikRep() {
        lista = new ArrayList<>(List.of(new Korisnik("Andja","Andjic","a@g.c","a"), new Korisnik("Djika","Andjic","dj@g.c","dj")));
    }

    public List<Korisnik> getLista() {
        return lista;
    }

    public void setLista(List<Korisnik> lista) {
        this.lista = lista;
    }
    
    
}
