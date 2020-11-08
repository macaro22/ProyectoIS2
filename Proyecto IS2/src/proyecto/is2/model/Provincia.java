/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.model;

import java.util.ArrayList;

/**
 *
 * @author carlosguardiola
 */
public class Provincia {

    private String nombre;
    private ArrayList<Club> clubs = new ArrayList<Club>();

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    public void addClub(Club club) {
        this.clubs.add(club);
    }

    public ArrayList consultarClub() {
        return clubs;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
