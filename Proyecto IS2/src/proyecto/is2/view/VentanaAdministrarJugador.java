/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import static java.lang.Integer.parseInt;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import proyecto.is2.controller.Admin;
import proyecto.is2.controller.Jugador;

/**
 *
 * @author carlosguardiola
 */
public class VentanaAdministrarJugador extends javax.swing.JFrame {
    
    private final Admin admin;
    private Jugador jugador;

    /**
     * Creates new form VentanaAdministrarJugador
     */
    public VentanaAdministrarJugador(JFrame VentanaAnterior, Admin admin) {
        this.admin = admin;
        this.ventanaAnterior = VentanaAnterior;
        initComponents();
        textDeudaActual.setEditable(false);
        botonBaja.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBuscar = new javax.swing.JLabel();
        textBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        labelJugador = new javax.swing.JLabel();
        botonAnyadirDeuda = new javax.swing.JButton();
        botonBaja = new javax.swing.JButton();
        textAnyadirDeuda = new javax.swing.JTextField();
        labelNombreJugador = new javax.swing.JLabel();
        textDeudaActual = new javax.swing.JTextField();
        labelAnyadirDeuda = new javax.swing.JLabel();
        labelDeudaActual = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();

        setTitle("Administrar Jugador");

        labelBuscar.setText("Introducir DNI");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        labelJugador.setText("Jugador: ");

        botonAnyadirDeuda.setText("Añadir");
        botonAnyadirDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnyadirDeudaActionPerformed(evt);
            }
        });

        botonBaja.setText("Dar de baja");
        botonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaActionPerformed(evt);
            }
        });

        textDeudaActual.setForeground(new java.awt.Color(102, 102, 102));

        labelAnyadirDeuda.setText("Add Deuda");

        labelDeudaActual.setText("Deuda Act");

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
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBuscar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(botonBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAnyadirDeuda)
                                    .addComponent(labelDeudaActual))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textDeudaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textAnyadirDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(botonBaja))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAnyadirDeuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(labelBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJugador)
                    .addComponent(labelNombreJugador))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAnyadirDeuda)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textAnyadirDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAnyadirDeuda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textDeudaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDeudaActual))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBaja)
                    .addComponent(botonAceptar))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        int dni = 0;
        dni = parseInt(textBuscar.getText());
        jugador = admin.SeleccionarJugador(dni);
        
        if (jugador != null) {
            labelNombreJugador.setText(jugador.nombre());
            textDeudaActual.setText("" + jugador.getDeuda() + "€");
            
            if (jugador.getDeuda() > 0) {
                botonBaja.setEnabled(false);
            } else {
                botonBaja.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha encontrado jugador", "error jugador seleccionado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonAnyadirDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnyadirDeudaActionPerformed
        // TODO add your handling code here:
        int deuda = 0;
        deuda = parseInt(textAnyadirDeuda.getText());
        
        if (deuda < 0) {
            JOptionPane.showMessageDialog(this, "La deuda ha de ser positiva", "error endeudar", JOptionPane.ERROR_MESSAGE);
        } else {
            jugador.setDeuda(jugador.getDeuda() + deuda);
        }
        
        textDeudaActual.setText("" + jugador.getDeuda() + "€");
        
        if (jugador.getDeuda() > 0) {
            botonBaja.setEnabled(false);
        } else {
            botonBaja.setEnabled(true);
        }
    }//GEN-LAST:event_botonAnyadirDeudaActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaActionPerformed
        // TODO add your handling code here:
        admin.darBajaJugador(jugador);
    }//GEN-LAST:event_botonBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAnyadirDeuda;
    private javax.swing.JButton botonBaja;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel labelAnyadirDeuda;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelDeudaActual;
    private javax.swing.JLabel labelJugador;
    private javax.swing.JLabel labelNombreJugador;
    private javax.swing.JTextField textAnyadirDeuda;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textDeudaActual;
    // End of variables declaration//GEN-END:variables
    private JFrame ventanaAnterior;
}
