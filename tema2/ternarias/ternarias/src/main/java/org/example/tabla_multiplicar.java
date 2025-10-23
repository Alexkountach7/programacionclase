package org.example;

import java.util.Scanner;

public class tabla_multiplicar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un numero");
        int numero = sc.nextInt();


        for ( int i= 0; i<=10; i++){
            System.out.println(i*numero);
        }

    }
}