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
public class Polimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Estudiante p1 = new Estudiante("wilson ", " armijos", "Universidad internacional del ecuador", "informatica y multimedia", 3);

        p1.Datos();

        System.out.println("\n");

        Estudiante2 p2 = new Estudiante2("Eduardo ", " Araujo", "Universidad internacional del ecuador", "informatica y multimedia", 3);

        p2.Datos2();

        System.out.println("\n");

        Estudiante3 p3 = new Estudiante3("Andres ", " Tandazo", "Universidad internacional del ecuador", "informatica y multimedia", 3);
        p3.Datos3();


        
    }
    
}
