/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.controller;
import proyecto.is2.model.Ajedrez;
/**
 *
 * @author carlosguardiola
 */
public class Jugador {
    
    private String nombre;
    private String apellidos;
    private String usuario;
    private String contrasenya;
    private int edad;
    private String provincia;
    private String club;
    protected Ajedrez ajedrez = new Ajedrez();
    
    public Jugador(String nombre, String apellidos, String usuario, String contrasenya, int edad, String provincia, String club){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.edad = edad;
        this.provincia = provincia;
        this.club = club;
        ajedrez.addUsuarioRegistrado(this);
    }
    
    public String nombre(){
        return nombre;
    }
}