package org.example;

import java.util.Scanner;

public class ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el numero de horas");
        int horas = sc.nextInt();
        System.out.println("introduce el numero de tarifa");
        double tarifa = sc.nextDouble();

        double salario = horas * tarifa;

        System.out.println("el salario del empleado es: " +salario +"€");
    }
}
