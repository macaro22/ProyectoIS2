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
public class partida extends JFrame{
    private JLabel nomRival, ganador, fecha, tiempo;
    private JButton boton;
    
    public partida(){
        nomRival = new JLabel("Nombre Rival");
        ganador = new JLabel ("Nombre Ganador");
        fecha = new JLabel("Fecha");
        tiempo = new JLabel("Duracion");
        boton = new JButton("GUARDAR");
                
    }
    
}
