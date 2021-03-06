/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import proyecto.is2.controller.Admin;
import proyecto.is2.controller.Jugador;
import proyecto.is2.controller.GestorAjedrez;

/**
 *
 * @author carlosguardiola
 */
public class Proyectois2View extends javax.swing.JFrame {

    private Admin admins;
    private GestorAjedrez gestorAjedrez;

    public Proyectois2View() {
        initComponents();

        try {
            gestorAjedrez = new GestorAjedrez();
            admins = new Admin("admin", "admin", gestorAjedrez.getAjezrez());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonEntrar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        labelUsuario = new javax.swing.JLabel();
        labelContrasenya = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        textContrasenya = new javax.swing.JPasswordField();
        imagenRey = new javax.swing.JLabel();
        imagenReina = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");

        botonEntrar.setText("Entrar");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        labelUsuario.setText("Usuario");

        labelContrasenya.setText("Contraseña");

        imagenRey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Rey.png"))); // NOI18N

        imagenReina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Reina.png"))); // NOI18N

        cerrar.setText("Cerrar App");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonEntrar)
                        .addGap(100, 100, 100)
                        .addComponent(botonRegistrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUsuario)
                            .addComponent(labelContrasenya))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textContrasenya)
                            .addComponent(textUsuario))))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cerrar)
                .addGap(13, 13, 13)
                .addComponent(imagenRey)
                .addGap(31, 31, 31)
                .addComponent(imagenReina)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuario))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContrasenya)
                    .addComponent(textContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEntrar)
                    .addComponent(botonRegistrar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenRey, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagenReina, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cerrar)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed

        String usuario = textUsuario.getText();
        String contrasenya = textContrasenya.getText();
        Jugador jugador = admins.ComprobarJugador(usuario);

        if (jugador != null || "admin".equals(usuario)) {
            if ("admin".equals(usuario)) {
                VentanaPrincipalAdmin admin = new VentanaPrincipalAdmin(this, admins);
                this.setVisible(false);
                admin.setVisible(true);
            } else if (jugador.getContrasenya().equals(contrasenya)) {
                VentanaPrincipalJugador principal = new VentanaPrincipalJugador(this, jugador);
                this.setVisible(false);
                principal.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "La contraseña no es correcta", "error iniciar", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El usuario no existe", "error iniciar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        VentanaRegistrar registrar = new VentanaRegistrar(this, admins);
        this.setVisible(false);
        registrar.setVisible(true);
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        gestorAjedrez.salir();
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proyectois2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyectois2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyectois2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyectois2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyectois2View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel imagenReina;
    private javax.swing.JLabel imagenRey;
    private javax.swing.JLabel labelContrasenya;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPasswordField textContrasenya;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
