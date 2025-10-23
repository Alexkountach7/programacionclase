package org.example;

import java.util.Scanner;

public class ejercicio_6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int total=0;
        int suma=0;
        System.out.println("cuantos numeros quieres sumar");
        int numero = sc.nextInt();
        for (int i=1; i<=numero; i++){
            System.out.println("inserta nª"+i+"=");
            numero = sc.nextInt();
            suma += numero;

        }
System.out.println("el resultado es" +suma);
    }
}
