/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import javax.swing.JFrame;

/**
 *
 * @author carlosguardiola
 */
public class VentanaRegistrar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistrar
     */
    public VentanaRegistrar(JFrame VentanaAnterior) {
        this.ventanaAnterior=VentanaAnterior;
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        comboSede = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Jugador");

        labelNombre.setText("Nombre y Apellido");

        labelEdad.setText("Edad");

        labelProvincia.setText("Provincia");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        comboProvincias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelUsuario.setText("Usuario");

        labelContrasenya.setText("Contraseña");

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Sede");

        comboSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                            .addComponent(jLabel1))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(textUsuario)
                            .addComponent(textContrasenya)
                            .addComponent(textEdad)
                            .addComponent(comboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
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
                    .addComponent(jLabel1)
                    .addComponent(comboSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
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
        VentanaPrincipalJugador principal = new VentanaPrincipalJugador();
        this.setVisible(false);
        principal.setVisible(true);
    }//GEN-LAST:event_botonRegistrarActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> comboProvincias;
    private javax.swing.JComboBox<String> comboSede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelContrasenya;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelProvincia;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JTextField textContrasenya;
    private javax.swing.JTextField textEdad;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
    private JFrame ventanaAnterior;
}
