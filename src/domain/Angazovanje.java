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
public class Angazovanje {
    private Long id;
    private Profesor profesor;
    private Predmet predmet;

    public Angazovanje() {
    }

    public Angazovanje(Long id, Profesor profesor, Predmet predmet) {
        this.id = id;
        this.profesor = profesor;
        this.predmet = predmet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.profesor);
        hash = 47 * hash + Objects.hashCode(this.predmet);
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
        final Angazovanje other = (Angazovanje) obj;
        if (!Objects.equals(this.profesor, other.profesor)) {
            return false;
        }
        return Objects.equals(this.predmet, other.predmet);
    }

    @Override
    public String toString() {
        return profesor + " " + predmet;
    }
    
    
}
