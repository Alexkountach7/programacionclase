package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Random aleatorio = new Random();
        int numero1 = aleatorio.nextInt(5)+1;
        int numero2 = aleatorio.nextInt(5)+1;
        System.out.println("numero aleatorio 1: "+numero1);
        System.out.println("numero aleatorio 2: "+numero2);
        int suma = numero1 +numero2;
        System.out.println("la suma de los dos dados: "+suma);

    }
}
