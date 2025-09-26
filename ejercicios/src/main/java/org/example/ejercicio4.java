package org.example;

import java.util.Scanner;

public class ejercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int mayor=0;
        int menor=0;
        System.out.println("introduce un numero");
        int numero1 = sc.nextInt();
        System.out.println("introduce otro numero");
        int numero2 = sc.nextInt();
        System.out.println("introduce el ultimo numero");
        int numero3 = sc.nextInt();

        if (numero1 == numero2 || numero2 == numero3 || numero1 == numero3){
            System.out.println("error los numeros introducidos deben ser diferentes");
        }else {
            if (numero1>numero2 && numero1>numero3){
                mayor = numero1;
            } else if (numero2>numero1 && numero2>numero3) {
                mayor = numero2;


            }else {
                mayor = numero3;
            }
        }if (numero1<numero2 && numero1<numero3){
            menor = numero1;
        } else if (numero2<numero1 && numero2<numero3) {
            menor = numero2;
        }else {
            menor = numero3;
        }
        System.out.println("el numero mayor es: "+mayor);
        System.out.println("el numero menor es: "+menor);
    }

}
