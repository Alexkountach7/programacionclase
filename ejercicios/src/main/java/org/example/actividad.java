package org.example;

import java.util.Scanner;

public class actividad {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String curso;
        int numero1;
        int numero2;
        System.out.println("¿Como te llamas?");
        nombre = sc.next();
        sc.nextLine();
        System.out.println("cual es tu curso?");
        curso = sc.nextLine();

        System.out.println("bienvenido " +nombre + " tu curso es " +curso);

        System.out.println("introduce un numero");
        numero1 = sc.nextInt();

        System.out.println("introduce otro numero");
        numero2 = sc.nextInt();

        System.out.println("el resultado de la suma es: " + (numero1+numero2));

        // opcion 2
        int suma = numero1+numero2;
        System.out.println("el resultado de la suma es: " +suma );


    }
}
