/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.model;

import java.util.ArrayList;
import java.util.Date;
import proyecto.is2.controller.GestorAjedrez;
import proyecto.is2.controller.Gerente;
import proyecto.is2.controller.Jugador;
import proyecto.is2.controller.Admin;

/**
 *
 * @author carlosguardiola
 */
public class Ajedrez {

    protected GestorAjedrez gestorAjedrez;
    protected ArrayList<Jugador> jugadoresRegistrados = new ArrayList<Jugador>();
    protected ArrayList<Jugador> morosos = new ArrayList<Jugador>();
    protected ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    protected ArrayList<Club> clubs = new ArrayList<Club>();
    protected ArrayList<Torneo> torneos = new ArrayList<Torneo>();
    protected ArrayList<Provincia> provincias = new ArrayList<Provincia>();
    protected ArrayList<Responsable> responsables = new ArrayList<Responsable>();
    private Jugador jugador;
    private Gerente gerente;

    public void CrearJugador(String nombre, String apellido, int dni, String usuario, String contrasenya, int edad, String provincia,
            String club, int deuda) {
        Jugador jugador = new Jugador(nombre, apellido, dni, usuario, contrasenya, edad, provincia, club, deuda, this);

        for (int i = 0; i < clubs.size(); i++) {
            if (clubs.get(i).toString().equals(club)) {
                clubs.get(i).AddJugadorClub(jugador);
            }
        }
    }

    public void addUsuarioRegistrado(Jugador jugador) {
        jugadoresRegistrados.add(jugador);

    }

    public void CrearGerente(String nombre,  String apellido, int dni, int edad, int nomina, int irpf) {
        Gerente geren = new Gerente(nombre, apellido, dni, edad, nomina, irpf, this);
    }

    public void addGerente(Gerente gerente) {
        gerentes.add(gerente);
    }

    public Gerente buscarGerente(int dni) {

        Gerente gerent = null;
        for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.get(i).getDNI() == dni) {
                gerent = gerentes.get(i);
                return gerent;
            }
        }
        return gerent;
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
        morosos.clear();

        for (int i = 0; i < jugadoresRegistrados.size(); i++) {
            if (jugadoresRegistrados.get(i).getDeuda() != 0) {
                morosos.add(jugadoresRegistrados.get(i));
            }
        }
        return morosos;
    }

    public Jugador ComprobarJugador(String usuario) {

        Jugador jugadors = null;

        for (int i = 0; i < jugadoresRegistrados.size(); i++) {
            if (jugadoresRegistrados.get(i).getUsuario().equals(usuario)) {
                jugadors = jugadoresRegistrados.get(i);
                return jugadors;
            }
        }
        return jugadors;
    }

    public Jugador SeleccionarJugador(int dni) {
        Jugador jugadors = null;

        for (int i = 0; i < jugadoresRegistrados.size(); i++) {
            if (jugadoresRegistrados.get(i).getDNI() == dni) {
                jugadors = jugadoresRegistrados.get(i);
                return jugadors;
            }
        }
        return jugadors;
    }

    public void darBajaJugador(Jugador jugadoborrar) {

        for (int i = 0; i < clubs.size(); i++) {
            if (clubs.get(i).toString().equals(jugadoborrar.getClub())) {
                clubs.get(i).eliminarJugadorClub(jugadoborrar);
            }
        }

        for (int i = 0; i < jugadoresRegistrados.size(); i++) {
            if (jugadoresRegistrados.get(i).getDNI() == jugadoborrar.getDNI()) {
                jugadoresRegistrados.remove(i);
            }
        }
    }

    public void anyadirClub(String provincia, String nombre) {
        Club club = new Club(nombre, null, provincia, null);
        clubs.add(club);
        for (int i = 0; i < provincias.size(); i++) {
            if (provincias.get(i).toString().equals(provincia)) {
                provincias.get(i).addClub(club);
            }
        }
    }

    public void anyadirTorneo(String nombre, Club club, String provincia) {
        Torneo torneo = new Torneo(nombre, provincia, club, null, null, null);
        torneos.add(torneo);
        for (int i = 0; i < clubs.size(); i++) {
            if (clubs.get(i).toString().equals(nombre)) {
                clubs.get(i).addTorneo(torneo);
            }
        }
    }

    public void eliminarClub(String nombre, String provincia) {
        for (int i = 0; i < clubs.size(); i++) {
            if (clubs.get(i).toString().equals(nombre)) {
                clubs.remove(i);
            }
        }

        for (int i = 0; i < provincias.size(); i++) {
            if (provincias.get(i).toString().equals(provincia)) {
                provincias.get(i).eliminarClub(nombre);
            }
        }

    }

    public void cambioClubJugador(String clubAntiguo, String clubNuevo, Jugador jugador) {

        for (int i = 0; i < clubs.size(); i++) {
            if (clubs.get(i).toString().equals(clubAntiguo)) {
                clubs.get(i).eliminarJugadorClub(jugador);
            }
        }

        for (int i = 0; i < clubs.size(); i++) {
            if (clubs.get(i).toString().equals(clubNuevo)) {
                clubs.get(i).AddJugadorClub(jugador);
            }
        }
    }

    public void historialGerente(String club) {
        Gerente gerente = null;
        for (int i = 0; i < clubs.size(); i++) {
            if (clubs.get(i).toString().equals(club)) {
                gerente = clubs.get(i).getGerente();
                System.out.println(gerente.nombre());
            }
        }
        if (gerente != null) {
            gerente.historialClub(club);
        }
    }

    public void cargarDatos() {
        Jugador jugador0 = new Jugador("Carlos", "Guardiola", 22222222, "guarboix", "guarboix", 21, "Valencia", "ShalyClub", 0, this);
        Jugador jugador1 = new Jugador("Maria", "Cano", 33333333, "marcano", "marcano", 21, "Alicante", "MeryClub", 0, this);
        Jugador jugador2 = new Jugador("Pepe", "Garcia", 44444444, "elpepe", "elpepe", 17, "Castellon", "loserClub", 200, this);
        Jugador jugador3 = new Jugador("Pepa", "Gutierrez", 55555555, "lapepa", "lapepa", 21, "Valencia", "WinnerClub", 50, this);

        Gerente gerente0 = new Gerente("Sharly", "Boix", 12345678, 21, 2000, 3, this);
        Gerente gerente1 = new Gerente("Amanda", "Rondas", 87654321, 33, 2210, 3, this);
        Gerente gerente2 = new Gerente("Alejandro", "Mreno", 12387645, 28, 3500, 3, this);
        Gerente gerente3 = new Gerente("Lucia", "Fernandez", 87612345, 25, 1900, 3, this);
        Gerente gerente4 = new Gerente("Paco", "Agallas", 11111111, 45, 2300, 3, this);

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

        Date fechainicio0 = new Date(234, 7, 6);
        Date fechafin0 = new Date(234, 5, 2);
        Date fechainicio1 = new Date(123, 5, 7);
        Date fechafin1 = new Date(987, 5, 4);
        Date fechainicio2 = new Date(234, 8, 6);
        Date fechafin2 = new Date(234, 9, 2);
        Date fechainicio3 = new Date(234, 10, 6);
        Date fechafin3 = new Date(234, 11, 2);

        Torneo torneo0 = new Torneo("Torneo0", "Valencia", club0, fechainicio0, fechafin0, "maria");
        Torneo torneo1 = new Torneo("Torneo1", "Alicante", club1, fechainicio1, fechafin1, "carlos");
        Torneo torneo2 = new Torneo("Torneo2", "Murcia", club2, fechainicio2, fechafin2, "maria");
        Torneo torneo3 = new Torneo("Torneo3", "Castellon", club3, fechainicio3, fechafin3, "carlos");

        provincia0.addClub(club1);
        provincia1.addClub(club2);
        provincia2.addClub(club0);
        provincia2.addClub(club3);

        club0.AddJugadorClub(jugador0);
        club1.AddJugadorClub(jugador1);
        club2.AddJugadorClub(jugador2);
        club3.AddJugadorClub(jugador3);
    }
}
