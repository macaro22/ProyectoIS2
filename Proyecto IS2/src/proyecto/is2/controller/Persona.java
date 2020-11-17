
package proyecto.is2.controller;

/**
 *
 * @author carlosguardiola
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    
    public Persona(String nombre, String apellidos, String dni, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    
}
