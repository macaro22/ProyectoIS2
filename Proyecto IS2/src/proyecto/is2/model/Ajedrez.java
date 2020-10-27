/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.model;
import java.util.ArrayList;
import proyecto.is2.controller.Gerente;
import proyecto.is2.controller.Jugador;

/**
 *
 * @author carlosguardiola
 */
public class Ajedrez {
    
     protected ArrayList<Jugador> jugadoresRegistrados = new ArrayList<Jugador>();
     protected ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
     private Jugador jugador;
     private Gerente gerente;
     
     
     public void addUsuarioRegistrado(Jugador jugador){
         jugadoresRegistrados.add(jugador);
         System.out.println("Cliente: "+jugadoresRegistrados.get(0).nombre());
     }
     
     public void addGerente(Gerente gerente){
         gerentes.add(gerente);
         System.out.println("Gerente: "+gerentes.get(0).nombre());
     }
}
