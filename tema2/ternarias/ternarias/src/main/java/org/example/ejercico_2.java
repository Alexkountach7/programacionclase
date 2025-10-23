package org.example;

import java.util.Scanner;

public class ejercico_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        System.out.println("Números del " + numero + " hasta el 1:");

        for (int i = numero; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
