/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import domain.Zvanje;
import java.util.List;
import controller.Controller;
import domain.Angazovanje;
import domain.Predmet;
import domain.Profesor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import tableModels.ModelTabeleAngazovanja;
/**
 *
 * @author Anđela
 */
public class UnosProfesoraFrm extends javax.swing.JFrame {
    private Controller controller;
    private List<Angazovanje> listaAng;
    /**
     * Creates new form UnosProfesoraFrm
     */
    public UnosProfesoraFrm() {
        initComponents();
        controller = Controller.getController(); 
        jTableAngazovanja.setModel(new ModelTabeleAngazovanja());
        popuniCmb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxZvanje = new javax.swing.JComboBox();
        jButtonSacuvaj = new javax.swing.JButton();
        jComboBoxPredmet = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAngazovanja = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxProfesor = new javax.swing.JComboBox();
        jButtonPrikaziAngazovanja = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonObrisi = new javax.swing.JButton();
        jButtonDodajAngazovanje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Zvanje");

        jButtonSacuvaj.setText("Sacuvaj profesora");
        jButtonSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacuvajActionPerformed(evt);
            }
        });

        jLabel4.setText("Predmet");

        jTableAngazovanja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableAngazovanja);

        jLabel5.setText("Profesor");

        jButtonPrikaziAngazovanja.setText("Prikazi angazovanja profesora");
        jButtonPrikaziAngazovanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrikaziAngazovanjaActionPerformed(evt);
            }
        });

        jLabel6.setText("Email");

        jButtonObrisi.setText("Obrisi angazovanje");
        jButtonObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObrisiActionPerformed(evt);
            }
        });

        jButtonDodajAngazovanje.setText("Dodaj angazovanje za profesora");
        jButtonDodajAngazovanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajAngazovanjeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxPredmet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(jComboBoxZvanje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldEmail)
                                .addComponent(jComboBoxProfesor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSacuvaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPrikaziAngazovanja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDodajAngazovanje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxZvanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSacuvaj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPredmet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButtonDodajAngazovanje))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrikaziAngazovanja))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButtonObrisi)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacuvajActionPerformed
        // TODO add your handling code here:
        String error = "";
        if(jTextFieldIme.getText() == null || jTextFieldIme.getText().isEmpty()){
            error += "Morate uneti ime \n";
        }
        if(jTextFieldPrezime.getText() == null || jTextFieldPrezime.getText().isEmpty()){
            error += "Morate uneti prezime \n";
        }
        if(jTextFieldEmail.getText() == null || jTextFieldEmail.getText().isEmpty()){
            error += "Morate uneti prezime \n";
        }
        if(!error.isEmpty()){
            JOptionPane.showMessageDialog(this, error , "GRESKA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Predmet p = (Predmet) jComboBoxPredmet.getSelectedItem();
        Zvanje z = (Zvanje) jComboBoxZvanje.getSelectedItem();
        try {
            controller.sacuvajProfesora(new Profesor(null,jTextFieldIme.getText(),jTextFieldPrezime.getText(),jTextFieldEmail.getText(), z));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() , "GRESKA", JOptionPane.ERROR_MESSAGE);
            return;
        }
         JOptionPane.showMessageDialog(this, "USPESNO SACUVAN PROFESOR" , "USPESNO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonSacuvajActionPerformed

    private void jButtonPrikaziAngazovanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrikaziAngazovanjaActionPerformed
        // TODO add your handling code here:
        Profesor p = (Profesor) jComboBoxProfesor.getSelectedItem();
        try {
            listaAng = controller.vratiAngazovanja(p);
            jTableAngazovanja.setModel(new ModelTabeleAngazovanja(listaAng));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() , "GRESKA", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_jButtonPrikaziAngazovanjaActionPerformed

    private void jButtonObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObrisiActionPerformed
        // TODO add your handling code here:
        int red = jTableAngazovanja.getSelectedRow();
        if(red == -1){
            JOptionPane.showMessageDialog(this, "Morate izabrati red u tabeli" , "GRESKA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ModelTabeleAngazovanja mta = (ModelTabeleAngazovanja) jTableAngazovanja.getModel();
        Angazovanje a = mta.getListAng().get(red);
        int opcija = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da obrisete angazovanje?", "POTVRDA", JOptionPane.YES_NO_OPTION);
        if(opcija == JOptionPane.YES_OPTION){
            try {
                controller.obrisiAngazovanje(a);
            } catch (Exception ex) {
                Logger.getLogger(UnosProfesoraFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "USPESNO OBRISANO ANGAZOVANJE" , "USPESNO", JOptionPane.INFORMATION_MESSAGE);
            osveziPodatke();
            return;
        }
    }//GEN-LAST:event_jButtonObrisiActionPerformed

    private void jButtonDodajAngazovanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajAngazovanjeActionPerformed
        // TODO add your handling code here:
        Predmet p = (Predmet) jComboBoxPredmet.getSelectedItem();
        Profesor prof = (Profesor) jComboBoxProfesor.getSelectedItem();
        try {
            controller.sacuvajAngazovanje(prof.getId(), p.getId());
            osveziPodatke();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() , "GRESKA", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "USPESNO SACUVANO ANGAZOVANJE" , "USPESNO", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonDodajAngazovanjeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodajAngazovanje;
    private javax.swing.JButton jButtonObrisi;
    private javax.swing.JButton jButtonPrikaziAngazovanja;
    private javax.swing.JButton jButtonSacuvaj;
    private javax.swing.JComboBox jComboBoxPredmet;
    private javax.swing.JComboBox jComboBoxProfesor;
    private javax.swing.JComboBox jComboBoxZvanje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAngazovanja;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIme;
    private javax.swing.JTextField jTextFieldPrezime;
    // End of variables declaration//GEN-END:variables

    private void popuniCmb() {
        
            for (Zvanje zvanje : Zvanje.values()) {
                jComboBoxZvanje.addItem(zvanje);
            }
        try {
            List<Predmet> listaP = controller.getListaPredmeta();
            for(Predmet p : listaP){
                jComboBoxPredmet.addItem(p);
            }
            
            List<Profesor> listaPr = controller.getListaProfesora();
            for(Profesor p : listaPr){
                jComboBoxProfesor.addItem(p);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void osveziPodatke(){
        Profesor prof = (Profesor) jComboBoxProfesor.getSelectedItem();
        ModelTabeleAngazovanja mta;
        try {
            mta = new ModelTabeleAngazovanja(controller.vratiAngazovanja(prof));
            jTableAngazovanja.setModel(mta);
        } catch (Exception ex) {
            Logger.getLogger(UnosProfesoraFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
