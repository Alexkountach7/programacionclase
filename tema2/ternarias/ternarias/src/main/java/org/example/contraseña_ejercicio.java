package org.example;

import java.util.Scanner;

public class contraseña_ejercicio {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String contraseña = "admin1234";


        do {

            System.out.println("introduce una contraseña");
            String respuesta = sc.nextLine();

            if (respuesta.equals(contraseña)) {
                System.out.println("contraseña correcta");
                break;
            }

            System.out.println("contraseña incorrecta ");
        } while (true);

        while (true) {
            System.out.println("inserte una palabra (o salir): ");
            String palabra = sc.next();

            if (palabra.toLowerCase().equals("salir")) {
                System.out.println("saliendo....");
                break;
            }
            if (palabra.equals("anulado")) {
                System.out.println("palabra prohibido");
                continue;

            }
            System.out.println(palabra + " gol");
        }
    }
}