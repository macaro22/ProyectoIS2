/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import proyecto.is2.controller.Jugador;

/**
 *
 * @author carlosguardiola
 */
public class VentanaPrincipalJugador extends javax.swing.JFrame {

    private final Jugador jugador;

    /**
     * Creates new form VentanaPrincipalJugador
     */
    public VentanaPrincipalJugador(JFrame VentanaAnterior, Jugador jugador) {
        this.ventanaAnterior = VentanaAnterior;
        this.jugador = jugador;
        initComponents();
        
        if (jugador.getEdad() >= 18) {
            botonResponsable.setEnabled(false);
        };
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonReservar = new javax.swing.JButton();
        botonPartidos = new javax.swing.JButton();
        botonResponsable = new javax.swing.JButton();
        labelClub = new javax.swing.JLabel();
        labelfederacion = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonApuntarTorneo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal Jugador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botonReservar.setText("Rservar Sede");
        botonReservar.setPreferredSize(new java.awt.Dimension(122, 32));
        botonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservarActionPerformed(evt);
            }
        });

        botonPartidos.setText("Datos Partidos");
        botonPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPartidosActionPerformed(evt);
            }
        });

        botonResponsable.setText("Responsable");
        botonResponsable.setPreferredSize(new java.awt.Dimension(122, 32));
        botonResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResponsableActionPerformed(evt);
            }
        });

        labelClub.setText("Club");
        labelClub.setPreferredSize(new java.awt.Dimension(30, 15));
        labelClub.setSize(new java.awt.Dimension(30, 15));

        labelfederacion.setText("Federación");
        labelfederacion.setPreferredSize(new java.awt.Dimension(30, 15));
        labelfederacion.setSize(new java.awt.Dimension(30, 15));

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonApuntarTorneo.setText("Apuntar Torneo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelClub, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(botonSalir))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botonApuntarTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonResponsable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonPartidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(labelfederacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClub, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelfederacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(botonReservar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(botonPartidos)
                .addGap(90, 90, 90)
                .addComponent(botonResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(botonApuntarTorneo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.setVisible(false);
        ventanaAnterior.setVisible(true);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResponsableActionPerformed
        VentanaResponsable responsable = new VentanaResponsable(this, jugador);
        responsable.setVisible(true);
    }//GEN-LAST:event_botonResponsableActionPerformed

    private void botonPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPartidosActionPerformed
        VentanaPartido partido = new VentanaPartido(this);
        partido.setVisible(true);
    }//GEN-LAST:event_botonPartidosActionPerformed

    private void botonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservarActionPerformed
        VentanaReserva reserva = new VentanaReserva(this);
        reserva.setVisible(true);
    }//GEN-LAST:event_botonReservarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonApuntarTorneo;
    private javax.swing.JButton botonPartidos;
    private javax.swing.JButton botonReservar;
    private javax.swing.JButton botonResponsable;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel labelClub;
    private javax.swing.JLabel labelfederacion;
    // End of variables declaration//GEN-END:variables
    private JFrame ventanaAnterior;
}
