package org.example;

import java.util.Scanner;

public class validador_isbn {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("** VALIDADOR ISBN **");
        System.out.println("1-VALIDAR ISBN");
        System.out.println("2-REPARAR ISBN ");
        System.out.println("X-SALIR");
        String opcion = sc.nextLine();
        System.out.println("introduce isbn");
        String numero = sc.nextLine();
        int numero_longitud = numero.length();
        switch (opcion) {
            case "1":
                if (numero_longitud != 10) {
                    System.out.println("el isbn es invalido");
                } else {
                    for (int i = 10; i >= 0; i--) {
                        
                    }
                }
        }
    }
}