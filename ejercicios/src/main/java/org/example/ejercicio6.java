package org.example;

import java.util.Scanner;

public class ejercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double altura;
        double base;
        do {
            System.out.println("introduce altura");
             altura = sc.nextDouble();
            if (altura<=0){
                System.out.println("error el numero debe ser mayor que cero");
            }
        }while (altura<=0);
        do {
            System.out.println("introduce base");
            base = sc.nextDouble();
            if (base<=0){
                System.out.println("error el numero debe ser mayor que cero ");
            }
        }while (base<=0);
        double area = (base*altura)/2;
        System.out.println("El resultado del area es: "+area );
    }
}
