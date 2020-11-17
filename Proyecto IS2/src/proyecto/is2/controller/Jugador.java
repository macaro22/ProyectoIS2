/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.controller;

import java.util.ArrayList;
import proyecto.is2.model.Ajedrez;
import proyecto.is2.model.Responsable;

/**
 *
 * @author carlosguardiola
 */
public class Jugador extends Persona {

    private String nombre;
    private String apellidos;
    private String usuario;
    private String contrasenya;
    private int edad;
    private int dni;
    private String provincia;
    private String club;
    private int deuda;
    private Responsable responsable;
    protected Ajedrez ajedrez;

    public Jugador(String nombre, String apellidos, int dni, String usuario, String contrasenya, int edad, String provincia, String club, int deuda, Ajedrez ajedrez) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.edad = edad;
        this.provincia = provincia;
        this.club = club;
        this.deuda = deuda;
        this.responsable = responsable;
        ajedrez.addUsuarioRegistrado(this);
    }

    public String nombre() {
        return nombre + " " + apellidos;
    }

    public void saldarDeuda() {
        deuda = 0;
    }

    public void setDeuda(int deudanueva) {
        deuda = deudanueva;
    }

    public int getDeuda() {
        return deuda;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public int getEdad() {
        return edad;
    }

    public int getDNI() {
        return dni;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String nuevoClub) {
        this.club = nuevoClub;
    }

    public void addResponsable(String nombre, int dni, int telefono, String domicilio) {
        Responsable responsable = new Responsable(nombre, dni, telefono, domicilio);
        this.responsable = responsable;
        System.out.print(responsable.getNombre());
    }
    
    public String getResponsable(){
        return responsable.getNombre();
    }
}
