/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.view;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author carlosguardiola
 */
public class menuJugador extends JFrame{
    
    private JButton reserva, partida, menor;
    
    public menuJugador(){
        
        reserva = new JButton("Reservar Sede");
        partida = new JButton("Datos de Partidas");
        menor = new JButton("Responsable Menor");
        
        this.add(reserva);
        this.add(partida);
        this.add(menor);
    }
}
