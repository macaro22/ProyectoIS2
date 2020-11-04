/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import static java.lang.Integer.parseInt;
import javax.swing.JFrame;
import proyecto.is2.controller.Admin;

/**
 *
 * @author carlosguardiola
 */
public class VentanaRegistrar extends javax.swing.JFrame {

    private final Admin admin;
    
    public VentanaRegistrar(JFrame VentanaAnterior, Admin admin) {
        this.ventanaAnterior = VentanaAnterior;
        this.admin =admin;
        initComponents();
        
        comboProvincias.addItem("Alicante");
        comboProvincias.addItem("Castellón");
        comboProvincias.addItem("Valencia");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombre = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        labelProvincia = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        comboProvincias = new javax.swing.JComboBox<>();
        textNombre = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        labelContrasenya = new javax.swing.JLabel();
        textContrasenya = new javax.swing.JTextField();
        textEdad = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        labelClub = new javax.swing.JLabel();
        comboClub = new javax.swing.JComboBox<>();
        labelApellidos = new javax.swing.JLabel();
        textApellidos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Jugador");

        labelNombre.setText("Nombre");

        labelEdad.setText("Edad");

        labelProvincia.setText("Provincia");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        comboProvincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProvinciasActionPerformed(evt);
            }
        });

        labelUsuario.setText("Usuario");

        labelContrasenya.setText("Contraseña");

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        labelClub.setText("Club");

        comboClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClubActionPerformed(evt);
            }
        });

        labelApellidos.setText("Apellidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEdad)
                            .addComponent(labelNombre)
                            .addComponent(labelProvincia)
                            .addComponent(labelUsuario)
                            .addComponent(labelContrasenya)
                            .addComponent(labelClub)
                            .addComponent(labelApellidos))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(textUsuario)
                            .addComponent(textContrasenya)
                            .addComponent(textEdad)
                            .addComponent(textApellidos)
                            .addComponent(comboProvincias, 0, 70, Short.MAX_VALUE)
                            .addComponent(comboClub, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApellidos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContrasenya)
                    .addComponent(textContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEdad)
                    .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProvincia)
                    .addComponent(comboProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelClub)
                    .addComponent(comboClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonRegistrar))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        ventanaAnterior.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    
    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        this.setVisible(false);
        ventanaAnterior.setVisible(true);
        
        String provincia = comboProvincias.getItemAt(comboProvincias.getSelectedIndex());
        String club = comboClub.getItemAt(comboClub.getSelectedIndex());
        
        admin.CrearJugador(textNombre.getText(), textApellidos.getText(), textUsuario.getText(), 
                textContrasenya.getText(),parseInt(textEdad.getText()), provincia, club,0);
    }//GEN-LAST:event_botonRegistrarActionPerformed

    
    private void comboProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProvinciasActionPerformed
        // TODO add your handling code here:
        int provincia = comboProvincias.getSelectedIndex();
        switch (provincia) {
            case 0:
                comboClub.removeAllItems();
                comboClub.addItem("Alicante1");
                comboClub.addItem("Alicante2");
                comboClub.addItem("Alicante");
                break;
            case 1:
                comboClub.removeAllItems();
                comboClub.addItem("Castellón1");
                comboClub.addItem("Castellón2");
                comboClub.addItem("Castellón3");
                break;
            default:
                comboClub.removeAllItems();
                comboClub.addItem("Valencia1");
                comboClub.addItem("Valencia2");
                comboClub.addItem("Valencia3");
                break;
        }
    }//GEN-LAST:event_comboProvinciasActionPerformed

    private void comboClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClubActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> comboClub;
    private javax.swing.JComboBox<String> comboProvincias;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelClub;
    private javax.swing.JLabel labelContrasenya;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelProvincia;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JTextField textApellidos;
    private javax.swing.JTextField textContrasenya;
    private javax.swing.JTextField textEdad;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
    private JFrame ventanaAnterior;
}
