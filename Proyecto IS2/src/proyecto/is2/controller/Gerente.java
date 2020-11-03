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
public class Gerente {
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private int nomina;
    private int irpf;
    protected Ajedrez ajedrez;
    
    
    public Gerente(String nombre, String apellido, int dni, int edad, int nomina, int irpf, Ajedrez ajedrez){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.irpf = irpf;
        ajedrez.addGerente(this);
    }
           
    public String nombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellido;
    }
    
    public int getDNI(){
        return dni;
    }
}
