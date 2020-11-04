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
/**
 *
 * @author carlosguardiola
 */
public class Admin {
    private String usuario;
    private String contrasenya;
    protected Ajedrez ajedrez = new Ajedrez();
    
    public Admin(String usuario, String contrasenya){
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        ajedrez.cargarDatos();
    }
    
    public void CrearGerente(String nombre, String apellido, int dni, int edad, int nomina, int irpf){
        ajedrez.CrearGerente(nombre,apellido,dni,edad,nomina,irpf);
    }
    
    public void CrearJugador(String nombre, String apellido, String usuario, String contrasenya, int edad, String provincia,
            String club,int deuda){
        ajedrez.CrearJugador(nombre,apellido,usuario,contrasenya,edad,provincia,club,deuda);
    }
    
    public Gerente EncontrarGerente(int dni){
        return ajedrez.buscarGerente(dni);
    }
    
    public ArrayList consultarProvincias() {
       return ajedrez.consultarProvincias();
    }
    
    public ArrayList<Club> consultarClub(String provincia) {
       return ajedrez.consultarClub(provincia);
    } 
    
    public ArrayList<Jugador> consultarMorosos() {
       return ajedrez.consultarMorosos();
    } 
    
    public Jugador ComprobarJugador(String usuario){
        return ajedrez.ComprobarJugador(usuario);
    }
}
