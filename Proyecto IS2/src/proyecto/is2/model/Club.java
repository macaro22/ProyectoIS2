/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.model;

import proyecto.is2.controller.Gerente;
/**
 *
 * @author carlosguardiola
 */
public class Club {
    private String nombre;
    private String sede;
    private Gerente gerente;
    
    
   public Club(String nombre, String sede){
       this.nombre = nombre;
       this.sede = sede;
   }
   
   public void addGerente(Gerente gerente){
       this.gerente=gerente;
   }
}
