/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contructores;

/**
 *
 * @author Wilson
 */
public class Alumno {
    //Atributos
    private String nombre;
    private String nombre1;
    private String apellido;
    private String apellido1;
    private String carrera;
    int cedula;
    
    //Metodos
    
    //Metodo constructor
    public Alumno(String nombre, String nombre1, String apellido, String apellido1, String carrera, int cedula){
        this.nombre = nombre;
        this.nombre1 = nombre1;
        this.apellido = apellido;
        this.apellido1 = apellido1;
        this.carrera = carrera;
        this.cedula = cedula;
        
    }

   
    
    public void mostrardatos(){
        System.out.println("Su nombre es " + nombre + nombre1 + apellido + apellido1 );
        System.out.println("Facultad" + carrera);
        System.out.println("El numero de cedula es " + cedula);
    }

}
