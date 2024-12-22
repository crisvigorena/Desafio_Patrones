package com.inforcap.main;

import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cifra, suma;

        System.out.println("Visualizador de patrones anidados");
        System.out.println("Ingrese la cantidad de asteriscos a visualizar: ");
        cifra = sc.nextInt();

        suma = cifra;

        //patron1

        System.out.println("Patron 1: ");

        //orden si el numero es uno
        if (cifra == 1)
            System.out.print("*");

        //orden si el numero es mayor o igual a 2
        if (cifra >= 2) {

            //iteracion para la parte superior
            for (int bordesup = 0; bordesup < cifra; bordesup++) {
                System.out.print("*");
            }
            System.out.println();

            //iteracion para la parte central
            for (int i = 0; i < cifra - 2; i++) {
                System.out.print("*");

                //iteracion anidada para el espacio vacio
                for (int i2 = 0; i2 < cifra - 2; i2++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            //iteracion para la parte inferior
            for (int bordeinf = 0; bordeinf < cifra; bordeinf++) {
                System.out.print("*");
            }
        }
        System.out.println();

        //patron 2

        System.out.println("Patron 2: ");

        //condicion si la cifra es 1
        if (cifra == 1)
            System.out.print("*");

        //condicion si la cifra es igual o mayor que 2
        if (cifra >= 2) {

            //iteracion para la parte superior
            for (int i = 0; i < cifra; i++) {
                System.out.print("*");
            }

            //iteracion para la parte central
            suma = (cifra - 1);
            for (int i = 0; i < suma; i++) {
                for (int j = 0; j < suma; j++) {
                    if ((i + j) == suma) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            //iteracion para la parte inferior
            for (int base = 0; base < cifra; base++)
                System.out.print("*");
        }
        System.out.println();

        //patron3

        System.out.println("patron 3: ");

        int y = (cifra - 1);

        //iteracion inicial
        for (int i = 0; i < cifra; i++) {

            //iteracion anidada para imprimir
            for (int j = 0; j < cifra; j++) {
                if ((i == j) || ((i + j) == y)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // patron 4


        System.out.print("Patron 4: ");

        System.out.println();

        //condicion entre 1 y 2
        if ((cifra >= 1) && (cifra < 3))
            System.out.print("*");

        //condicion adicional si se elige numero 2
        if (cifra == 2) {
            System.out.println();
            System.out.print(" *");
        }

        //condicion si el numero es mayor que 2
        if (cifra > 2) {

            //orden de iteracion para la parte superior
            for (int i = 1; i < cifra; i++) {
                System.out.print("*");
            }

            //orden de iteracion para el centro
            for (int i2 = 2; i2 < cifra; i2++) {
                for (int i3 = 2; i3 < cifra; i3++) {
                    if (cifra > 2) System.out.print(" ");
                }
                System.out.print("\n ");

                for (int i = 2; i < cifra; i++) {
                    System.out.print("*");
                }
            }

            // orden para la parte inferior
            System.out.println();
            System.out.print(" ");

            // iteracion para la parte inferior
            for (int i = 1; i < cifra; i++) {
                System.out.print("*");
            }
        }
    }
}
