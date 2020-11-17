/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.controller;

import proyecto.is2.model.Club; //

/**
 *
 * @author usuario
 */
public class Entrenador extends Persona{

    private String nombre;
    private String apellidos;
    private int edad;
    //private String club; 

    public Entrenador(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

}
