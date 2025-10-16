package org.example;

import java.util.Scanner;

public class ejercicio_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String text = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String palabra = "mundo";
        text = text.toUpperCase();
        palabra = palabra.toUpperCase();
        int tamaño_texto = text.length();
        text = text.replace(palabra,"");
        int tamaño_texto_nuevo =text.length();

        int veces = (tamaño_texto-tamaño_texto_nuevo)/palabra.length();
        System.out.println(veces);
    }
}
