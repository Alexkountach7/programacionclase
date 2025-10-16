package org.example;

import java.util.Scanner;

public class ejercicio_3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero = sc.nextInt();
        System.out.println("introdece las cifras que quieres eliminar");
        int cifras = sc.nextInt();

        String numero_string= Integer.toString(numero);
        int tamaño = numero_string.length();

        int nuevo_tamaño = tamaño-cifras;

        String numero_cortado = numero_string.substring(0,nuevo_tamaño);
        System.out.println("el numero cortado es "+numero_cortado);
    }
}
