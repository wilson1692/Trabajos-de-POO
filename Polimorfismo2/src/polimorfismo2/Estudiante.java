/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo2;

/**
 *
 * @author Wilson
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String universidad;
    private String facultad;
    int ciclo;

    public Estudiante(){
        this.nombre = nombre;
        this.apellido = apellido;
        this.universidad = universidad;
        this.facultad = facultad;
        this.ciclo = ciclo;
    }
    
    public Estudiante(String nombre,String apellido,String universidad, String facultad, int ciclo){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.universidad = universidad;
        this.facultad = facultad;
        this.ciclo = ciclo;
    }
    
    public void Datos(){
        System.out.println("El alumno " + nombre  +  apellido);
        System.out.println("Es alumno de la " + universidad);
        System.out.println("Pertenece a la facultad de :" + facultad);
        System.out.println("Esta cursando el ciclo : " + ciclo );
    }
     
}
