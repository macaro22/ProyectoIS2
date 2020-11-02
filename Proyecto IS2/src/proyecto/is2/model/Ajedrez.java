/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.model;

import java.util.ArrayList;
import proyecto.is2.controller.Gerente;
import proyecto.is2.controller.Jugador;
import proyecto.is2.controller.Admin;

/**
 *
 * @author carlosguardiola
 */
public class Ajedrez {

    protected ArrayList<Jugador> jugadoresRegistrados = new ArrayList<Jugador>();
    protected ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    private Jugador jugador;
    private Gerente gerente;

    public void addUsuarioRegistrado(Jugador jugador) {
        jugadoresRegistrados.add(jugador);
        System.out.println("Cliente: " + jugadoresRegistrados.get(0).nombre());
    }

    public void CrearGerente(String nombre, String apellido, int dni, int edad, int nomina, int irpf){
        Gerente geren = new Gerente(nombre,apellido,dni,edad,nomina,irpf,this);
    }
    
    public void addGerente(Gerente gerente) {
        gerentes.add(gerente);
    }

    public String buscarGerente(int dni) {
        
        String nombre = "No encontrado";
        
        for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.get(i).getDNI() == dni) {
                nombre = gerentes.get(i).nombre();
            }
        }
        return nombre;
    }
}
