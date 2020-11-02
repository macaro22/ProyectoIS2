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
    
    public String EncontrarGerente(int dni){
        return ajedrez.buscarGerente(dni);
    }
}
