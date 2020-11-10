/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.model;

/**
 *
 * @author carlosguardiola
 */
public class Responsable {
    
    private String nombre;
    private int dni;
    private int telefono;
    private String domicilio;
    
    public Responsable(String nombre, int dni, int telefono, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }
    
    public String getNombre(){
        return nombre;
    }
}
