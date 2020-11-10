/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import javax.swing.JFrame;
import proyecto.is2.controller.Admin;

/**
 *
 * @author usuario
 */
public class VentanaApuntarTorneo extends javax.swing.JFrame {

    private Admin admin;
    
    public VentanaApuntarTorneo(JFrame VentanaAnterior) {
        this.ventanaAnterior = VentanaAnterior;
        initComponents();
        for (int i = 0; i < admin.consultarTorneo().size(); i++) {
            comboNombre.addItem(admin.consultarTorneo().get(i).toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboNombre = new javax.swing.JComboBox<>();
        labelNombre = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNombreActionPerformed(evt);
            }
        });

        labelNombre.setText("Nombre torneo");

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
                .addGap(138, 138, 138)
                .addComponent(botonAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(labelNombre)
                .addGap(36, 36, 36)
                .addComponent(comboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNombreActionPerformed
            
        String nombre = comboNombre.getSelectedItem().toString();
        for (int i = 0; i < admin.consultarTorneo().size(); i++) {
            comboNombre.addItem(admin.consultarTorneo().get(i).toString());
        }
    }//GEN-LAST:event_comboNombreActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        VentanaApuntarTorneo apuntarTorneo = new VentanaApuntarTorneo(ventanaAnterior);
        this.setVisible(false);
        
        apuntarTorneo.setVisible(true);
        
        String nombre = comboNombre.getItemAt(comboNombre.getSelectedIndex());
    }//GEN-LAST:event_botonAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JComboBox<String> comboNombre;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
    private JFrame ventanaAnterior;
}
