/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.model;

import java.util.ArrayList;
import java.util.Date;
import proyecto.is2.model.Club;
import proyecto.is2.controller.Admin;

/**
 *
 * @author usuario
 */
public class Torneo {
    private String nombre;
    private String provincia;
    private Club club;
    //private Admin admin;
    //private int fecha;
    private String ganador;
    protected ArrayList<Club> clubs = new ArrayList<Club>();
    private Date fechainicio = new Date();
    private Date fechafin =  new Date();
    
    public Torneo(String nombre,String provincia,Club club,Date fechainicio,Date fechafin, String ganador){
        this.nombre = nombre;
        this.provincia = provincia;
        this.club = club;
        this.ganador = ganador;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        
    }
    public void ModificarNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void ModificarGanador(String ganador){
        this.ganador=ganador;
    }
    public void ModificarProvincia(String provincia){
        this.provincia = provincia;
    }
    public void ModificarFechaIinicio(Date fechainicio){
        this.fechainicio = fechainicio;
    }
    public void ModificarFechaFin(Date fechafin){
        this.fechafin = fechafin;
    }
    public String getNombre(){
        return nombre;
    }
    
    public String getGanador(){
        return ganador;
    }
    public String getProvincia(){
        return provincia;
    }
    public Date getFechaInicio(){
        return fechainicio;
    }
    
    public Date getFechaFin(){
        return fechafin;
    }
    public void AddClubTorneo(Club club) {
       clubs.add(club);
    }
    
}
