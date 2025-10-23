package org.example;

import java.util.Scanner;

public class ejercicio_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un texto");
        String texto = sc.next();
        int tamaño = texto.length();
        for (int i =tamaño -1 ; i>=0; i--){
            System.out.println(texto.charAt(i));
        }
    }
}
