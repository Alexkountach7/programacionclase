package org.example;

import java.util.Formattable;
import java.util.Random;
import java.util.Scanner;

public class ejercicio_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        String caracteres = "AIOJGESOIJGOIRJEOIGJOITERJIEGIJTRHOIRTH";

        String contraseña = "";
        for (int i =0; i<12; i++){
            contraseña += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
        }
        System.out.println(contraseña);
    }
}
