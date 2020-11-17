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
    
    protected GestorAjedrez gestorAjedrez;
    protected ArrayList<Jugador> jugadoresRegistrados = new ArrayList<Jugador>();
    protected ArrayList<Jugador> morosos = new ArrayList<Jugador>();
    protected ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    protected ArrayList<Club> clubs = new ArrayList<Club>();
    protected ArrayList<Torneo> torneos = new ArrayList<Torneo>();
    protected ArrayList<Provincia> provincias = new ArrayList<Provincia>();
    protected ArrayList<Responsable> responsables = new ArrayList<Responsable>();
}
