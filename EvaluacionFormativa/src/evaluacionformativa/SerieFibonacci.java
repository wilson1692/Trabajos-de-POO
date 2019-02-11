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
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 

        fibo1=1;
        fibo2=1; 

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
        int fac=1;
        for (int j = 1; j <=numero; j++) {
             fac=fac*j;
        }
        System.out.println("el factorial de  " + numero + " = " + fac);
    }
    }
    

