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
    protected ArrayList<Club> clubs = new ArrayList<Club>();
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
        System.out.println("Gerente: " + gerentes.get(0).nombre());
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
    
     public void cargarDatos() {
       Jugador jugador0 = new Jugador("Carlos","Guardiola","guarboix","guarboix",21,"","");  
       Jugador jugador1 = new Jugador("Maria","Cano","marcano","marcano",21,"","");  
       Jugador jugador2 = new Jugador("Pepe","Garcia","elpepe","elpepe",21,"","");  
       Jugador jugador3 = new Jugador("Pepa","Gutierrez","lapepa","lapepa",21,"","");  
       
       Gerente gerente0 = new Gerente("Sharly","Boix",21,12345678,2000,10,this);
       Gerente gerente1 = new Gerente("Amanda","Rondas",33,87654321,2210,10,this);
       Gerente gerente2 = new Gerente("Alejandro","Mreno",28,12387645,3500,10,this);
       Gerente gerente3 = new Gerente("Lucia","Fernandez",25,87612345,1900,10,this);  
       
       Club club0 = new Club("ShalyClub","Ribarroja","Valencia",gerente0);
       Club club1 = new Club("MeryClub","Murcia","Alicante",gerente1);
       Club club2 = new Club("loserClub","CastellonSity","Castellon",gerente2);
     }
}
