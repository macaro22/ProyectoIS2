/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import java.util.ArrayList;
import javax.swing.JFrame;
import proyecto.is2.controller.Admin;

/**
 *
 * @author carlosguardiola
 */
public class VentanaClub extends javax.swing.JFrame {
    
    private final Admin admin;
    String gerente;
    protected ArrayList provincia = new ArrayList();
    /**
     * Creates new form VentanaClub
     */
    public VentanaClub(JFrame VentanaAnterior, Admin admin, String gerente) {
        this.ventanaAnterior=VentanaAnterior;
        this.admin = admin;
        this.gerente = gerente;
        initComponents();
        
        for(int i=0; i<admin.consultarProvincias().size(); i++)
            comboProvincia.addItem(admin.consultarProvincias().get(i).toString());
        
        textSede.setEditable(false);
        textGerente.setEditable(false);
        textEntrenador.setEditable(false);
        
        provincia = admin.consultarProvincias();
        
        textGerente.setText(gerente);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelProvincia = new javax.swing.JLabel();
        labelClub = new javax.swing.JLabel();
        comboProvincia = new javax.swing.JComboBox<>();
        comboClub = new javax.swing.JComboBox<>();
        labelSede = new javax.swing.JLabel();
        labelGerente = new javax.swing.JLabel();
        labelEntrenador = new javax.swing.JLabel();
        botonModificarSede = new javax.swing.JButton();
        textSede = new javax.swing.JTextField();
        textGerente = new javax.swing.JTextField();
        textEntrenador = new javax.swing.JTextField();
        botonModificarGerente = new javax.swing.JButton();
        botonModificarEntrenador = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();

        setTitle("Información del club");

        labelProvincia.setText("Provincia");

        labelClub.setText("Club");

        comboProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProvinciaActionPerformed(evt);
            }
        });

        labelSede.setText("Sede");

        labelGerente.setText("Gerente");

        labelEntrenador.setText("Entrenador");

        botonModificarSede.setText("Modificar");
        botonModificarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarSedeActionPerformed(evt);
            }
        });

        botonModificarGerente.setText("Modificar");
        botonModificarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarGerenteActionPerformed(evt);
            }
        });

        botonModificarEntrenador.setText("Modificar");

        botonAceptar.setText("Aceptar");

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labelProvincia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(labelClub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboClub, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSede)
                            .addComponent(labelEntrenador)
                            .addComponent(labelGerente))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textSede)
                            .addComponent(textGerente)
                            .addComponent(textEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonModificarSede)
                            .addComponent(botonModificarGerente)
                            .addComponent(botonModificarEntrenador)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(botonAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(botonBuscar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProvincia)
                    .addComponent(labelClub)
                    .addComponent(comboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSede)
                    .addComponent(botonModificarSede))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGerente)
                    .addComponent(botonModificarGerente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEntrenador)
                    .addComponent(botonModificarEntrenador))
                .addGap(18, 18, 18)
                .addComponent(botonAceptar)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarSedeActionPerformed
        this.setVisible(false);
        ventanaAnterior.setVisible(true);
    }//GEN-LAST:event_botonModificarSedeActionPerformed

    private void botonModificarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarGerenteActionPerformed
        // TODO add your handling code here:
        VentanaModificarClub modificarClub = new VentanaModificarClub(1,this,admin);
        this.setVisible(false);
        modificarClub.setVisible(true);
        
    }//GEN-LAST:event_botonModificarGerenteActionPerformed

    private void comboProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProvinciaActionPerformed
        // TODO add your handling code here:
        int provincia = comboProvincia.getSelectedIndex();
        switch (provincia) {
            case 0:
                comboClub.removeAllItems();
                for(int i=0; i<admin.consultarClub("Alicante").size(); i++){
                    comboClub.addItem(admin.consultarClub("Alicante").get(i).toString());
                }
                break;
            case 1:
                comboClub.removeAllItems();
                for(int i=0; i<admin.consultarClub("Castellon").size(); i++){
                    comboClub.addItem(admin.consultarClub("Castellon").get(i).toString());
                }
                break;
            default:
                comboClub.removeAllItems();
                for(int i=0; i<admin.consultarClub("Valencia").size(); i++){
                    comboClub.addItem(admin.consultarClub("Valencia").get(i).toString());
                }
                break;
        }
    }//GEN-LAST:event_comboProvinciaActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        int index = 0;
        index = comboClub.getSelectedIndex();
        textSede.setText(admin.consultarClub("Valencia").get(index).toString());
        textGerente.setText(admin.consultarClub("Valencia").get(index).toString());
    }//GEN-LAST:event_botonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonModificarEntrenador;
    private javax.swing.JButton botonModificarGerente;
    private javax.swing.JButton botonModificarSede;
    private javax.swing.JComboBox<String> comboClub;
    private javax.swing.JComboBox<String> comboProvincia;
    private javax.swing.JLabel labelClub;
    private javax.swing.JLabel labelEntrenador;
    private javax.swing.JLabel labelGerente;
    private javax.swing.JLabel labelProvincia;
    private javax.swing.JLabel labelSede;
    private javax.swing.JTextField textEntrenador;
    private javax.swing.JTextField textGerente;
    private javax.swing.JTextField textSede;
    // End of variables declaration//GEN-END:variables
    private JFrame ventanaAnterior;
}
