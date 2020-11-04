/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.controller;
import java.util.ArrayList;
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
    private int deuda;
    protected Ajedrez ajedrez;
    
    public Jugador(String nombre, String apellidos, String usuario, String contrasenya, int edad, String provincia,String club, int deuda, Ajedrez ajedrez){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.edad = edad;
        this.provincia = provincia;
        this.club = club;
        this.deuda = deuda;
        ajedrez.addUsuarioRegistrado(this);
    }
    
    public String nombre(){
        return nombre + " "+apellidos;
    }
    
    public void saldarDeuda(){
        deuda=0;
    }
    
    public int getDeuda(){
        return deuda;
    }    
}