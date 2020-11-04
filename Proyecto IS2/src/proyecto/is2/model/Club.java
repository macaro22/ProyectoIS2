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
    private String provincia;
    
    
   public Club(String nombre, String sede, String provincia, Gerente gerente){
       this.nombre = nombre;
       this.sede = sede;
       this.provincia = provincia; 
       this.gerente = gerente;
   }
   
   public void ModificarGerente(Gerente gerente){
       this.gerente=gerente;
   }
   
   public void ModificarSede(String sede){
       this.sede=sede;
    }
   
    
    public String getSede(){
       return sede;
   }
    
    public Gerente getGerente(){
       return gerente;
   }
    @Override
    public String toString(){
        return nombre;
    }
}
