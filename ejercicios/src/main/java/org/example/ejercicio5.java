package org.example;

import java.util.Scanner;

public class ejercicio5 {
    static void main() {
        double numero1=0;
        double numero2=0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("introducir numero");
             numero1 = sc.nextDouble();
            System.out.println("introducir otro numero ");
             numero2 = sc.nextDouble();


        }catch (Exception err){
            System.out.println("error has introducido un valor invalido");
        }
        if (numero2 == 0) {
            System.out.println("ERROR: debes introducir un numero mayor que cero ");

        } else {
            double division = numero1 / numero2;
            System.out.println("el resultado es" + division);
        }
    }
}