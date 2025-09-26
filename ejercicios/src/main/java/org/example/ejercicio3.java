package org.example;

import java.util.Scanner;

public class ejercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero1 = sc.nextInt();
        System.out.println("introduce otro numero");
        int numero2 = sc.nextInt();

        if (numero1>0){
            System.out.println("el numero es positivo ");
        }else if (numero2<0){
            System.out.println("el numero es negativo");
        }else {
            System.out.println("el numero es natural");
        }
    }
}
