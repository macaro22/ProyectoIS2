/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.controller;

import java.util.ArrayList;
import proyecto.is2.model.Ajedrez;
import proyecto.is2.model.Club;

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
    public ArrayList<Integer> historialNomina = new ArrayList<Integer>();
    public ArrayList<Integer> historialIRPF = new ArrayList<Integer>();
    public ArrayList<String> historialClub = new ArrayList<String>();

    public Gerente(String nombre, String apellido, int dni, int edad, int nomina, int irpf, Ajedrez ajedrez) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.nomina = nomina;
        this.irpf = irpf;
        ajedrez.addGerente(this);
    }

    public String nombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public int getDNI() {
        return dni;
    }

    public int getNomina() {
        return nomina;
    }

    public int getIRPF() {
        return irpf;
    }

    public void setNomina(int nominaa) {
        historialNomina.add(nomina);
        this.nomina = nominaa;
    }

    public void setIRPF(int irpf) {
        historialIRPF.add(this.irpf);
        this.irpf = irpf;
    }

    public void historialClub(String club) {
        historialClub.add(club);
    }
}
