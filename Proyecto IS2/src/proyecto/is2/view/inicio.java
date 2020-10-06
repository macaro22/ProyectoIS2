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
 *
 * @author carlosguardiola
 */
public class inicio extends JFrame{
    private JButton boton1, boton2;
    private JLabel usu,contraseña ;
    private JLabel vacio, vacio2;
 
    
    public inicio(){
        boton1 = new JButton("Entrar");
        boton2 = new JButton("Registro");
        usu = new JLabel("Usario");
        contraseña = new JLabel("Contraseña");
        vacio = new JLabel();
        vacio2 = new JLabel();
        
        this.setSize(200,300);
        
        this.add(boton1);
        this.add(boton2);
        this.add(usu);
        this.add(contraseña);
        this.add(vacio);
        this.add(vacio2);
    
    }
    
    
}
