/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import proyecto.is2.controller.Jugador;
import javax.swing.JFrame;

/**
 *
 * @author carlosguardiola
 */
public class VentanaReserva extends javax.swing.JFrame {

    private Jugador jugador;

    /**
     * Creates new form VentanaReserva
     */
    public VentanaReserva(JFrame VentanaAnterior) {
        this.ventanaAnterior = VentanaAnterior;
        initComponents();
        comboProvincia.addItem("Alicante");
        comboProvincia.addItem("Valencia");
        comboProvincia.addItem("Catellon");

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
        textSede = new javax.swing.JLabel();
        comboSede = new javax.swing.JComboBox<>();
        textProvincia = new javax.swing.JLabel();
        comboProvincia = new javax.swing.JComboBox<>();

        setTitle("Reservar la Sede");

        labelDia.setText("Día");

        comboHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelHora.setText("Hora");

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        textSede.setText("Sede");

        comboSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        textProvincia.setText("Provincia");

        comboProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDia)
                    .addComponent(textSede)
                    .addComponent(labelHora)
                    .addComponent(textProvincia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboHora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboSede, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textProvincia)
                    .addComponent(comboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSede)
                    .addComponent(comboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(botonAceptar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        VentanaReserva reserva = new VentanaReserva(ventanaAnterior);
        this.setVisible(false);

        reserva.setVisible(true);

        String provincia = comboProvincia.getItemAt(comboProvincia.getSelectedIndex());
        String club = comboSede.getItemAt(comboSede.getSelectedIndex());

        //Falta añadir jugador

    }//GEN-LAST:event_botonAceptarActionPerformed
    private void comboProvinciaActionPerformed(java.awt.event.ActionEvent evt) {
        int provincia = comboProvincia.getSelectedIndex();
        switch (provincia) {
            case 0:
                comboSede.removeAllItems();
                comboSede.addItem("Alicante1");
                comboSede.addItem("Alicante2");
                comboSede.addItem("Alicante");
                break;
            case 1:
                comboSede.removeAllItems();
                comboSede.addItem("Castellón1");
                comboSede.addItem("Castellón2");
                comboSede.addItem("Castellón3");
                break;
            default:
                comboSede.removeAllItems();
                comboSede.addItem("Valencia1");
                comboSede.addItem("Valencia2");
                comboSede.addItem("Valencia3");
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JComboBox<String> comboHora;
    private javax.swing.JComboBox<String> comboProvincia;
    private javax.swing.JComboBox<String> comboSede;
    private datechooser.beans.DateChooserCombo dateDia;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel textProvincia;
    private javax.swing.JLabel textSede;
    // End of variables declaration//GEN-END:variables
    private JFrame ventanaAnterior;
}
