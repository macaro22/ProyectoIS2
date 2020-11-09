/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import static java.lang.Integer.parseInt;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    String provincia;
    String club;

    /**
     * Creates new form VentanaModificarClub
     */
    public VentanaModificarClub(JFrame VentanaAnterior, Admin admin, String club, String provincia) {
        this.ventanaAnterior = VentanaAnterior;
        this.admin = admin;
        this.club = club;
        this.provincia = provincia;
        initComponents();
        areaHistorial.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        textBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        labelBuscar = new javax.swing.JLabel();
        botonCambioGerente = new javax.swing.JButton();
        comboEncontrado = new javax.swing.JComboBox<>();
        labelHistorial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaHistorial = new javax.swing.JTextArea();
        botonVolver = new javax.swing.JButton();
        labelDatosContrato = new javax.swing.JLabel();
        textNomina = new javax.swing.JTextField();
        textIRPF = new javax.swing.JTextField();
        labelNomina = new javax.swing.JLabel();
        labelIRPF = new javax.swing.JLabel();
        botonGuardarContrato = new javax.swing.JButton();
        imagenPerfil = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setTitle("Modificar Club");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        labelBuscar.setText("Buscar por DNI:");

        botonCambioGerente.setText("Cambiar Gerente");
        botonCambioGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambioGerenteActionPerformed(evt);
            }
        });

        labelHistorial.setText("Historial");

        areaHistorial.setColumns(20);
        areaHistorial.setRows(5);
        jScrollPane1.setViewportView(areaHistorial);

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        labelDatosContrato.setText("Modificar datos contrato");

        textNomina.setForeground(new java.awt.Color(102, 102, 102));

        textIRPF.setForeground(new java.awt.Color(102, 102, 102));

        labelNomina.setText("Nómina");

        labelIRPF.setText("IRPF");

        botonGuardarContrato.setText("Guardar ");
        botonGuardarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarContratoActionPerformed(evt);
            }
        });

        imagenPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/perfil.png"))); // NOI18N
        imagenPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelHistorial)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBuscar)
                                .addGap(18, 110, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textIRPF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonGuardarContrato)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBuscar)
                                    .addComponent(comboEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDatosContrato)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelIRPF)
                                        .addComponent(labelNomina)))))
                        .addGap(13, 13, 13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCambioGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(imagenPerfil)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagenPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBuscar)
                            .addComponent(labelDatosContrato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscar)
                            .addComponent(textNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomina))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelIRPF)
                                    .addComponent(textIRPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(comboEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGuardarContrato)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(botonCambioGerente)
                        .addGap(8, 8, 8)
                        .addComponent(botonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelHistorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCambioGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambioGerenteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        for (int i = 0; i < admin.consultarClub(provincia).size(); i++) {
            if (admin.consultarClub(provincia).get(i).toString().equals(club)) {
                admin.consultarClub(provincia).get(i).ModificarGerente(gerente);
            }
        }
        ventanaAnterior.setVisible(true);
    }//GEN-LAST:event_botonCambioGerenteActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:

        String historialNom, historialIRPF;
        comboEncontrado.removeAllItems();
        int dni = parseInt(textBuscar.getText());
        gerente = admin.EncontrarGerente(dni);

        if (gerente != null) {
            noombre = gerente.nombre() + " " + gerente.getApellidos();
            comboEncontrado.addItem(noombre);

            textNomina.setText("" + gerente.getNomina());
            textIRPF.setText("" + gerente.getIRPF());

            historialNom = "";
            historialIRPF = "";

            for (int i = 0; i < gerente.historialNomina.size(); i++) {
                historialNom = historialNom + gerente.historialNomina.get(i) + "€, ";
            }

            for (int i = 0; i < gerente.historialIRPF.size(); i++) {
                historialIRPF = historialIRPF + gerente.historialIRPF.get(i) + "%, ";
            }

            areaHistorial.setText("CONTRATOS:" + "\n"
                    + "     Sus nóminas han sido: " + historialNom + "." + "\n"
                    + "     Sus IRPF han sido: " + historialIRPF + "." + "\n\n"
                    + "CLUBS ANTERIORES:"+"\n"
                    + "     Ha estado en: ");
        } else {
            JOptionPane.showMessageDialog(this, "No se ha encontrado el gerente", "error gerente seleccionado", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ventanaAnterior.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonGuardarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarContratoActionPerformed
        // TODO add your handling code here:
        gerente.setNomina(parseInt(textNomina.getText()));
        gerente.setIRPF(parseInt(textIRPF.getText()));
    }//GEN-LAST:event_botonGuardarContratoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaHistorial;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCambioGerente;
    private javax.swing.JButton botonGuardarContrato;
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> comboEncontrado;
    private javax.swing.JLabel imagenPerfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelDatosContrato;
    private javax.swing.JLabel labelHistorial;
    private javax.swing.JLabel labelIRPF;
    private javax.swing.JLabel labelNomina;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textIRPF;
    private javax.swing.JTextField textNomina;
    // End of variables declaration//GEN-END:variables
    private JFrame ventanaAnterior;
}
