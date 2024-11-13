/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Objects;

/**
 *
 * @author Anđela
 */
public class Predmet {
    private Long id;
    private String naziv, kod;
    private int esp;

    public Predmet() {
    }

    public Predmet(Long id, String naziv, String kod, int esp) {
        this.id = id;
        this.naziv = naziv;
        this.kod = kod;
        this.esp = esp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getEsp() {
        return esp;
    }

    public void setEsp(int esp) {
        this.esp = esp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
        hash = 19 * hash + Objects.hashCode(this.naziv);
        hash = 19 * hash + Objects.hashCode(this.kod);
        hash = 19 * hash + this.esp;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Predmet other = (Predmet) obj;
        if (this.esp != other.esp) {
            return false;
        }
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        if (!Objects.equals(this.kod, other.kod)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
}
