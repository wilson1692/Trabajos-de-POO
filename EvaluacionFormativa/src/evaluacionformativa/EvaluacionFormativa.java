/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionformativa;

import java.util.Scanner;

/**
 *
 * @author Wilson
 */
public class EvaluacionFormativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int datosA[];
        int datosB[];
        try {
            System.out.println("INGRESE EL TAMAÑO DEL ARREGLO A ");
            int tamanioA = new Scanner(System.in).nextInt();
            System.out.println("INGRESE EL TAMAÑO DEL ARREGLO B ");
            int tamanioB = new Scanner(System.in).nextInt();
            datosA = new int[tamanioA];
            datosB = new int[tamanioB];
            ingresardatos(datosA);
            ingresarelementos(datosB);
            CalcularSuma(datosA, datosB);
            CalcularResta(datosA, datosB);
            CalcularProducto(datosA, datosB);
            CalcularDivision(datosA, datosB);
        } catch (Exception e) {
            System.out.println("Datos incorrectos");
        }
    }
    private static void ingresardatos(int[] datosA) {
        for (int i = 0; i <datosA.length; i++) {
            System.out.println("Ingresar elementos A " + (i+1));
            datosA[i] = new Scanner(System.in).nextInt();
        }      
    }
    private static void ingresarelementos(int[] datosB) {
        for (int i = 0; i < datosB.length; i++) {
            System.out.println("Ingresar elementos B " + ( i + 1 ));
            datosB[i] = new Scanner(System.in).nextInt();
        }
    }
    private static void CalcularSuma(int[] datosA, int[] datosB) {
        int suma=0;
        for (int i = 0; i < datosA.length ; i++) {
            suma = (datosA[i] + datosB[i]);       
            System.out.println("La Suma del Arreglo  : " + datosA[i] + " + " + datosB[i] + " = " + suma);      
        }
    }
    private static void CalcularResta(int[] datosA, int[] datosB) {
        int resta;
        for (int i = 0; i < datosB.length; i++) {
            resta = (datosA[i] - datosB[i]);
            System.out.println("La Resta del Arreglo  : " + datosA[i] + " - " + datosB[i] + " = " + resta);
        }
    }

    private static void CalcularProducto(int[] datosA, int[] datosB) {
        int producto;
        for (int i = 0; i <datosA.length; i++) {
            producto = (datosA[i] * datosB[i]);
            System.out.println("El Producto del Arreglo  : " + datosA[i] + " * " + datosB[i] + " = " + producto);
        }    
    }

    private static void CalcularDivision(int[] datosA, int[] datosB) {
        double division;
        for (int i = 0; i < datosA.length; i++) {
            division = datosA[i] / datosB[i];
            System.out.println("La Division del Arreglo : " + datosA[i] + " / " + datosB[i] + " = " + division);
        }
    }
}
  

