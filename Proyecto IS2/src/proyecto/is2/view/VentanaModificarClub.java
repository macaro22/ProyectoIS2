/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import static java.lang.Integer.parseInt;
import javax.swing.JFrame;
import proyecto.is2.controller.Gerente;
import proyecto.is2.controller.Admin;
/**
 *
 * @author carlosguardiola
 */
public class VentanaModificarClub extends javax.swing.JFrame {

    private Gerente gerente;
    private final Admin admin;
    String noombre;
    /**
     * Creates new form VentanaModificarClub
     */
    public VentanaModificarClub(int buscar, JFrame VentanaAnterior, Admin admin) {
        this.ventanaAnterior=VentanaAnterior;
        this.admin = admin;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        labelBuscar = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        comboEncontrado = new javax.swing.JComboBox<>();

        setTitle("Modificar Club");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        labelBuscar.setText("Buscar por DNI:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboEncontrado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(botonBuscar)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(37, 37, 37)
                .addComponent(comboEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ventanaAnterior.setVisible(true);
        VentanaClub clubs = new VentanaClub(this,admin,noombre);
        clubs.setVisible(true);
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        int dni = parseInt(textBuscar.getText());
        noombre = admin.EncontrarGerente(dni);
        comboEncontrado.addItem(noombre);
    }//GEN-LAST:event_botonBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JComboBox<String> comboEncontrado;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JTextField textBuscar;
    // End of variables declaration//GEN-END:variables
    private JFrame ventanaAnterior;
}
