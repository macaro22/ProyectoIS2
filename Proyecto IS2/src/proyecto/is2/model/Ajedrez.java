/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.model;
import java.util.ArrayList;
import proyecto.is2.controller.Jugador;

/**
 *
 * @author carlosguardiola
 */
public class Ajedrez {
    
     protected ArrayList<Jugador> jugadoresRegistrados = new ArrayList<Jugador>();
     private Jugador jugador;
     
     public void addUsuarioRegistrado(Jugador jugador){
         jugadoresRegistrados.add(jugador);
     }
}
