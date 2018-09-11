/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author alba
 */
public class Persona {
    /* 
    java nos recomenda que las variables de una clase deben ser privadas y sus 
    metodos publicos 
    */
    
   private String nombre;
    private int edad; 
    private String sexo;
     private String direccion; 
     
     
     //constructor
     public Persona (String nombre, int edad, String sexo, String direccion) {
         
         this.nombre = nombre;
         this.edad = edad;
         this. sexo = sexo;
         this.direccion = direccion;
     
     }
     //los metodos GET permiten rrecuperar el valor de un atributo 
     //de la clase 
     
     // los metodos SET permiten cambiar el calor de un atributo 
     //de la clase 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
     
     
     
    
}
