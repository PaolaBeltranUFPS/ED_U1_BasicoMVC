/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.datos.modelo;

/**
 *
 * @author Boris Perez
 */
public class RegistroNegocio {

    private String nombre, apellido;
    private int edad;
    
    public boolean registrarPersona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
        if(edad > 0 & edad >= 18){
            return true;
        }else{
            return false;
        }
    }
    
}
