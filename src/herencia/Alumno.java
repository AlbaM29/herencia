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
public class Alumno extends Persona {
    private String clave;
    private String grupo;
    private int semestre; 
    private String carrera; 

    public Alumno(String nombre, int edad, String sexo, String direccion,
            String clave, String grupo, int semestre, String carrera) {
        //super indica que los atributos pertenecen a la clase padre 
        super(nombre, edad, sexo, direccion);
        this.clave = clave;
        this.grupo = grupo;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    //los metodos GET permiten rrecuperar el valor de un atributo 
     //de la clase 
     
     // los metodos SET permiten cambiar el calor de un atributo 
     //de la clase 

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    
}
