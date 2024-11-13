/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tableModels;

import domain.Angazovanje;
import domain.Profesor;
import domain.Zvanje;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Anđela
 */
public class ModelTabeleAngazovanja extends AbstractTableModel {
    private List<Angazovanje> listAng = new ArrayList<>();
    private String[] kolone = {"Naziv","Kod","Espb","Ime", "Prezime","Zvanje","Email"};
    public ModelTabeleAngazovanja(){
        
    }
    
    public ModelTabeleAngazovanja(List<Angazovanje> listAng){
        this.listAng = listAng;
    }

    public List<Angazovanje> getListAng() {
        return listAng;
    }

    public void setListAng(List<Angazovanje> listAng) {
        this.listAng = listAng;
    }
    
    
    @Override
    public int getRowCount() {
        return listAng.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Angazovanje a = (Angazovanje) listAng.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return a.getPredmet().getNaziv();
            case 1:
                return a.getPredmet().getKod();
            case 2:
                return a.getPredmet().getEsp();
            case 3:
                return a.getProfesor().getIme();
            case 4:
                return a.getProfesor().getPrezime();
            case 5:
                return String.valueOf(a.getProfesor().getZvanje());
            case 6:
                return a.getProfesor().getEmail();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }



    
    }

    
    
    
    
    
    

