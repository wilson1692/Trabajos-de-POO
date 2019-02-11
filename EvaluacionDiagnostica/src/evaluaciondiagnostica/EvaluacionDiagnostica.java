/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciondiagnostica;

import java.util.Scanner;

/**
 *
 * @author Wilson
 */
public class EvaluacionDiagnostica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char operacion = 's';//s:suma-r:resta-m:multiplicar-d:division
        int n1;
        int a = 0;
        int n2;
        int suma;
        int resta;
        int producto;
        double division;
        double raiz;
        System.out.println("INGRESE OPERACION(s:suma - r: resta - m:multiplicar - d:Division )");
        operacion = new Scanner(System.in).next().charAt(0);
        if (operacion == 's') {
            System.out.println("INGRESE NUMERO 1");
            n1 = new Scanner(System.in).nextInt();
            System.out.println("INGRESE NUMERO 2");
            n2 = new Scanner(System.in).nextInt();
            suma = n1 + n2;
            raiz = Math.sqrt(suma);
            System.out.println("LA SUMA DE " + n1 + " + " + n2 + " = " + suma);
            System.out.println("LA RAIZ DE LA SUMA ES " + raiz);
            if (raiz % 2 == 0) {
                System.out.println("EL NUMEROS ES PAR " + raiz);
            } else {
                System.out.println("EL NUMERO ES IMPAR " + raiz);
            }
            for (int i = 1; i <= raiz; i++) {
                if (raiz % i == 0) {
                    a++;
                }

            }
            if (a != 2) {
                System.out.println("EL NUMERO NO ES PRIMO");

            } else {
                System.out.println("EL NUMERO ES PRIMO");
            }
        } else {
            if (operacion == 'r') {
                System.out.println("INGRESE NUMERO 1");
                n1 = new Scanner(System.in).nextInt();
                System.out.println("INGRESE NUMERO 2");
                n2 = new Scanner(System.in).nextInt();
                resta = n1 - n2;
                raiz = Math.sqrt(resta);
                System.out.println("LA RESTA DE " + n1 + " - " + n2 + " = " + resta);
                System.out.println("LA RAIZ DE LA RESTA ES " + raiz);
                if (raiz % 2 == 0) {
                    System.out.println("EL NUMEROS ES PAR " + raiz);
                } else {
                    System.out.println("EL NUMERO ES IMPAR " + raiz);
                }
                for (int i = 1; i <= raiz; i++) {
                    if (raiz % i == 0) {
                        a++;
                    }
                }
                if (a != 2) {
                    System.out.println("EL NUMERO NO ES PRIMO");

                } else {
                    System.out.println("EL NUMERO ES PRIMO");
                }
                if (operacion == 'm') {
                    System.out.println("INGRESE NUMERO 1");
                    n1 = new Scanner(System.in).nextInt();
                    System.out.println("INGRESE NUMERO 2");
                    n2 = new Scanner(System.in).nextInt();
                    producto = n1 * n2;
                    raiz = Math.sqrt(producto);
                    System.out.println("EL PRODUCTO DE " + n1 + " * " + n2 + " = " + producto);
                    System.out.println("LA RAIZ DEL PRODUCTO ES " + raiz);
                    if (raiz % 2 == 0) {
                        System.out.println("EL NUMEROS ES PAR " + raiz);
                    } else {
                        System.out.println("EL NUMERO ES IMPAR " + raiz);
                    }
                    for (int i = 1; i <= raiz; i++) {
                        if (raiz % i == 0) {
                            a++;
                        }
                    }
                    if (a != 2) {
                        System.out.println("EL NUMERO NO ES PRIMO");

                    } else {
                        System.out.println("EL NUMERO ES PRIMO");
                    }
                    if (operacion == 'd') {
                        System.out.println("INGRESE NUMERO 1");
                        n1 = new Scanner(System.in).nextInt();
                        System.out.println("INGRESE NUMERO 2");
                        n2 = new Scanner(System.in).nextInt();
                        division = n1 / n2;
                        raiz = Math.sqrt(division);
                        System.out.println("LA DIVISION DE " + n1 + " / " + n2 + " = " + division);
                        System.out.println("LA RAIZ DE LA DIVISION ES " + raiz);
                        if (raiz % 2 == 0) {
                            System.out.println("EL NUMEROS ES PAR " + raiz);
                        } else {
                            System.out.println("EL NUMERO ES IMPAR " + raiz);
                        }
                        for (int i = 1; i <= raiz; i++) {
                            if (raiz % i == 0) {
                                a++;
                            }
                        }
                        if (a != 2) {
                            System.out.println("EL NUMERO NO ES PRIMO");

                        } else {
                            System.out.println("EL NUMERO ES PRIMO");
                        }

                    }
                }

            }
        }
    }
}

    

