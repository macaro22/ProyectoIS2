/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author mariacano
 * @author carlosguardiola
 */
public class registro extends JFrame{
    private JLabel nombre, apellidos, fechaNac, dni;
    private JButton boton;
    
    public registro(){
        nombre = new JLabel("Nombre");
        apellidos = new JLabel("Apellidos");
        fechaNac = new JLabel("Fecha Nacimiento");
        dni = new JLabel("DNI");
        boton = new JButton("GUARDAR");
        
        this.add(nombre);
        this.add(apellidos);
        this.add(fechaNac);
        this.add(dni);
        this.add(boton);
        
    }
    
    
    
}
