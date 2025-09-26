package org.example;

import java.util.Scanner;

public class ejercicio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el numero de horas");
        int horas = sc.nextInt();
        System.out.println("introduce el numero de tarifa");
        double tarifa = sc.nextDouble();




        if (horas>40){
            double salariosimple=40 * tarifa;
            double horassuplemento = horas-40;
            double suplementohorario = horassuplemento * tarifa*1.5;
            System.out.println("el salario con suplemento es: "+(suplementohorario+ salariosimple) +"€");
        }else {
            double salario = horas * tarifa;
            System.out.println("el salario del empleado es: " +salario +"€");
        }
    }
}
