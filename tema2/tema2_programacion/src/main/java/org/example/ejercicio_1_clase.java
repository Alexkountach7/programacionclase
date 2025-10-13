package org.example;

import java.util.Scanner;

public class ejercicio_1_clase {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int numero1 = 124;
        int numero2= 212;

        String numero_string = Integer.toString(numero1);
        String numero_izquierda = numero_string.substring(0,1);
        int numero_izquierda_int = Integer.parseInt((numero_izquierda));

        System.out.println(numero_izquierda_int*100);

        numero_izquierda = numero_string.substring(1,2);
        numero_izquierda_int = Integer.parseInt(numero_izquierda);
        System.out.println(numero_izquierda_int*10);


    }
}
