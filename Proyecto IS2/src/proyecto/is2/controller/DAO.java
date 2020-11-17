/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.controller;

import java.util.ArrayList;
import proyecto.is2.model.Club;
import proyecto.is2.model.Provincia;
import proyecto.is2.model.Responsable;
import proyecto.is2.model.Torneo;

/**
 *
 * @author carlosguardiola
 */
public class DAO {
    
    public GestorAjedrez gestorAjedrez;
    public ArrayList<Jugador> jugadoresRegistrados = new ArrayList<Jugador>();
    public ArrayList<Jugador> morosos = new ArrayList<Jugador>();
    public ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    public ArrayList<Club> clubs = new ArrayList<Club>();
    public ArrayList<Torneo> torneos = new ArrayList<Torneo>();
    public ArrayList<Provincia> provincias = new ArrayList<Provincia>();
    public ArrayList<Responsable> responsables = new ArrayList<Responsable>();
    
    
}
