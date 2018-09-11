/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author alba
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1 = new Persona("Julio", 20, "hombre", "celaya");
        
        System.out.println(persona1.getNombre());
        
        Alumno alumno1 = new Alumno ("Andres", 
                                      19, 
                                      "hombre",
                                      "cortazar", 
                                      "a001", 
                                      "A", 
                                      1,
                                       "sistemas");
        System.out.println(alumno1.getCarrera());
        Scanner entrada = new Scanner (System.in);
        String nombre; 
        int edad;
        String sexo;
        String direccion;
        String clave;
        String grupo;
        int semestre;
        String carrera;
        
        System.out.println("ingresa el nombre del alumno");
        nombre= entrada.next();
        System.out.println("ingresa la edad del amlumno");
        edad = entrada.nextInt();
        System.out.println("ingresa el sexo del alumno");
        sexo = entrada.next();
        System.out.println("ingresa la direccion del alumno");
        direccion = entrada.next();
        System.out.println("ingresa la clave del alumno");
        clave= entrada.next();
        System.out.println("ingresa el grupo del alumno");
        grupo= entrada.next();
        System.out.println("ingresa el semestre del alumno");
        semestre = entrada.nextInt();
        System.out.println("ingresa la carrera del  alumno");
        carrera= entrada.next();
        Alumno alumno_nuevo = new Alumno(
                    nombre,
                    edad,
                    sexo,
                    direccion,
                    clave,
                    grupo,
                   semestre,
                    carrera);
        System.out.println(alumno_nuevo.getNombre());
        System.out.println(alumno_nuevo.getEdad());
        System.out.println(alumno_nuevo.getSexo());
        System.out.println(alumno_nuevo.getDireccion());
        System.out.println(alumno_nuevo.getClave());
        System.out.println(alumno_nuevo.getGrupo());
        System.out.println(alumno_nuevo.getSemestre());
    }
  
    }
    
    

