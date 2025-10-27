package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int numero = 0;
        System.out.println("introduce un rango minimo");
        int minimo = sc.nextInt();
        System.out.println("introduce un rango maximo");
        int maximo = sc.nextInt();
        System.out.println("cuantos numeros aleatorios");
        int aleatorios = sc.nextInt();

        if (minimo > maximo) {
            System.out.println("el numero minimo no puede ser mayor que el maximo");
        } else {


            for (int i = 1; i <= aleatorios; i++) {
                numero = aleatorio.nextInt(maximo - minimo + 1) + minimo;
                System.out.println("los aleatorios son numero " +i+ "= "+numero);
            }

        }
    }
}

