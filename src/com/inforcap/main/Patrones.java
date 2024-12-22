package com.inforcap.main;

import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Impresor de patrones");
        System.out.println("Ingrese la cantidad de cifras a visualizar: ");
        int cifra = sc.nextInt();
        patron1(cifra);
        patron2(cifra);
        patron3(cifra);
    }
    static void patron1(int cifra){
        System.out.println("Patron 1: ");

        int i;
        for (i = 1; i <= cifra; i++) {
            if (i % 2 == 1) {
                System.out.print("*");
            } else System.out.print(".");
        }
        System.out.println();
    }

    static void patron2(int cifra) {
        System.out.println("Patron 2: ");

        int i2;
        for (i2 = 1; i2 <= cifra; i2++) {
            if (i2 % 4 == 1) {
                System.out.print("1");
            }
            if (i2 % 4 == 2) {
                System.out.print("2");
            }
            if (i2 % 4 == 3) {
                System.out.print("3");
            }
            if (i2 % 4 == 0) {
                System.out.print("4");
            }
        }
         if (i2%4 == 1) {
             i2 = 1;
             i2++;
         }
        System.out.println();
         }
          static void patron3(int cifra){
              System.out.println("Patron 3: ");

        int i3;
        for (i3 = 1; i3 <= cifra; i3++) {
            if (i3 % 3 == 1) {
                System.out.print("|");
            }
            if (i3 % 3 == 2) {
                System.out.print("|");
            }
            if (i3 % 3 == 0) {
                System.out.print("*");
            }
        }
        if (i3 %3 == 1){
            i3 = 1;
            i3++;
          }
    }
}
