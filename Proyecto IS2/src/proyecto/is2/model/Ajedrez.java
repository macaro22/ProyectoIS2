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
    protected ArrayList<Jugador> morosos = new ArrayList<Jugador>();
    protected ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    protected ArrayList<Club> clubs = new ArrayList<Club>();
    protected ArrayList<Provincia> provincias = new ArrayList<Provincia>();
    private Jugador jugador;
    private Gerente gerente;

    public void CrearJugador(String nombre, String apellido, String usuario, String contrasenya, int edad, String provincia,
            String club, int deuda) {
        Jugador jugador = new Jugador(nombre, apellido, usuario, contrasenya, edad, provincia, club, deuda, this);
    }

    public void addUsuarioRegistrado(Jugador jugador) {
        jugadoresRegistrados.add(jugador);
    }

    public void CrearGerente(String nombre, String apellido, int dni, int edad, int nomina, int irpf) {
        Gerente geren = new Gerente(nombre, apellido, dni, edad, nomina, irpf, this);
    }

    public void addGerente(Gerente gerente) {
        gerentes.add(gerente);
    }

    public Gerente buscarGerente(int dni) {
        
        for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.get(i).getDNI() == dni) {
                return gerentes.get(i);
            }
        }
        return null;
    }

    public ArrayList consultarProvincias() {
        return provincias;
    }

    public ArrayList consultarClub(String provincia) {

        for (int i = 0; i < provincias.size(); i++) {
            if (provincias.get(i).toString().equals(provincia)) {
                return provincias.get(i).consultarClub();
            }
        }
        return provincias;
    }

    public ArrayList consultarMorosos() {

        for (int i = 0; i < jugadoresRegistrados.size(); i++) {
            if (jugadoresRegistrados.get(i).getDeuda() != 0) {
                morosos.add(jugadoresRegistrados.get(i));
            }
        }
        return morosos;
    }

    public void cargarDatos() {
        Jugador jugador0 = new Jugador("Carlos", "Guardiola", "guarboix", "guarboix", 21, "", "", 0, this);
        Jugador jugador1 = new Jugador("Maria", "Cano", "marcano", "marcano", 21, "", "", 0, this);
        Jugador jugador2 = new Jugador("Pepe", "Garcia", "elpepe", "elpepe", 21, "", "", 200, this);
        Jugador jugador3 = new Jugador("Pepa", "Gutierrez", "lapepa", "lapepa", 21, "", "", 0, this);

        Gerente gerente0 = new Gerente("Sharly", "Boix", 12345678, 21, 2000, 10, this);
        Gerente gerente1 = new Gerente("Amanda", "Rondas", 87654321, 33, 2210, 10, this);
        Gerente gerente2 = new Gerente("Alejandro", "Mreno", 12387645, 28, 3500, 10, this);
        Gerente gerente3 = new Gerente("Lucia", "Fernandez", 87612345, 25, 1900, 10, this);

        this.addGerente(gerente1);

        Provincia provincia0 = new Provincia("Alicante");
        Provincia provincia1 = new Provincia("Castellon");
        Provincia provincia2 = new Provincia("Valencia");
        provincias.add(provincia0);
        provincias.add(provincia1);
        provincias.add(provincia2);

        Club club0 = new Club("ShalyClub", "Ribarroja", "Valencia", gerente0);
        Club club1 = new Club("MeryClub", "Murcia", "Alicante", gerente1);
        Club club2 = new Club("loserClub", "CastellonSity", "Castellon", gerente2);
        Club club3 = new Club("WinnerClub", "Estació den nord", "Valencia", gerente3);
        clubs.add(club0);
        clubs.add(club1);
        clubs.add(club2);
        clubs.add(club3);

        provincia0.addClub(club1);
        provincia1.addClub(club2);
        provincia2.addClub(club0);
        provincia2.addClub(club3);
    }
}
