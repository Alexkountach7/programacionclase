package org.example;

import java.util.Scanner;

public class ejercicio_5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int oportunidad=0;
        String frase1;
        String palabra;
        int contador;
        boolean contienepalabra=false;
        do {
                System.out.println("introduce una frase");
                 frase1= sc.nextLine();
                System.out.println("introduce una palabra ");
                palabra= sc.nextLine();

            oportunidad ++;
            int totaloportunidades = 10 - oportunidad ;

            sc.nextLine();

            frase1 = frase1.toUpperCase();
            palabra = palabra.toUpperCase();

            int tamaño_frase = frase1.length();
            int tamaño_palabra = palabra.length();

            contienepalabra = frase1.contains(palabra);

            System.out.println(contienepalabra);
            if (oportunidad<10) {
                System.out.println("Intento fallido tienes " + totaloportunidades + " oportunidades");
            }else {

            }
        }while (oportunidad<10);






    }
}
