/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.controller;

import java.util.ArrayList;
import proyecto.is2.model.Ajedrez;
import proyecto.is2.model.Provincia;
import proyecto.is2.model.Club;
import proyecto.is2.model.Torneo;

/**
 *
 * @author carlosguardiola
 */
public class Admin {

    private String usuario;
    private String contrasenya;
    protected Ajedrez ajedrez;

    public Admin(String usuario, String contrasenya, Ajedrez ajedrez) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.ajedrez = ajedrez;
    }

    public void CrearGerente(String nombre, String apellido, int dni, int edad, int nomina, int irpf) {
        ajedrez.CrearGerente(nombre, apellido, dni, edad, nomina, irpf);
    }

    public void CrearJugador(String nombre, String apellido, int dni, String usuario, String contrasenya, int edad, String provincia,
            String club, int deuda) {
        ajedrez.CrearJugador(nombre, apellido, dni, usuario, contrasenya, edad, provincia, club, deuda);
    }

    public Gerente EncontrarGerente(int dni) {
        return ajedrez.buscarGerente(dni);
    }

    public ArrayList consultarProvincias() {
        return ajedrez.consultarProvincias();
    }

    public ArrayList<Club> consultarClub(String provincia) {
        return ajedrez.consultarClub(provincia);
    }
    
    public ArrayList<Torneo> consultarTorneo(){
        return ajedrez.consultarTorneo();
    }

    public ArrayList<Jugador> consultarMorosos() {
        return ajedrez.consultarMorosos();
    }

    public Jugador ComprobarJugador(String usuario) {
        return ajedrez.ComprobarJugador(usuario);
    }

    public Jugador SeleccionarJugador(int dni) {
        return ajedrez.SeleccionarJugador(dni);
    }

    public void darBajaJugador(Jugador jugador) {
        ajedrez.darBajaJugador(jugador);
    }

    public void anyadirClub(String provincia, String nombre) {
        ajedrez.anyadirClub(provincia, nombre);
    }

    public void eliminarClub(String nombre, String provincia) {
        ajedrez.eliminarClub(nombre, provincia);
    }
    
    public void anyadirTorneo(String nombre,Club club,String provincia){
        ajedrez.anyadirTorneo(nombre,club,provincia);
    }

    public void cambioClubJugador(String clubAntiguo, String clubNuevo, Jugador jugador){
        ajedrez.cambioClubJugador(clubAntiguo, clubNuevo, jugador);
    }
}
