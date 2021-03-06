/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import java.util.Date;
import proyecto.is2.controller.Jugador;
import javax.swing.JFrame;
import proyecto.is2.controller.Admin;

/**
 *
 * @author carlosguardiola
 */
public class VentanaReserva extends javax.swing.JFrame {

    private Jugador jugador;
    private Admin admin;

    /**
     * Creates new form VentanaReserva
     */
    public VentanaReserva(JFrame VentanaAnterior) {
        
        initComponents();
        this.ventanaAnterior = VentanaAnterior;
        int hora1 = 17;
        int min = 00;
        int hora2 = 19;
        int hora3 = 21;
        
        comboHora.removeAllItems();
        comboHora.addItem(hora1+":"+min);
        comboHora.addItem(hora2+":"+min);
        comboHora.addItem(hora3+":"+min);    

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDia = new javax.swing.JLabel();
        dateDia = new datechooser.beans.DateChooserCombo();
        comboHora = new javax.swing.JComboBox<>();
        labelHora = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();

        setTitle("Reservar la Sede");

        labelDia.setText("Día");

        comboHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHoraActionPerformed(evt);
            }
        });

        labelHora.setText("Hora");

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDia)
                    .addComponent(labelHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboHora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateDia, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(labelDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHora)
                    .addComponent(comboHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
       ventanaAnterior.setVisible(true);
        this.setVisible(false);

        //Falta añadir jugador

    }//GEN-LAST:event_botonAceptarActionPerformed

    private void comboHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHoraActionPerformed
        Date hora = new Date();
        
            
    }//GEN-LAST:event_comboHoraActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JComboBox<String> comboHora;
    private datechooser.beans.DateChooserCombo dateDia;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelHora;
    // End of variables declaration//GEN-END:variables
    private JFrame ventanaAnterior;
}
