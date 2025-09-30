package org.example;

import java.util.Scanner;

public class ejercicio8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un lado ");
        double ladoA = sc.nextDouble();
        System.out.println("introduce otro lado");
        double ladoB = sc.nextDouble();
        System.out.println("introduce otro lado ");
        double ladoC = sc.nextDouble();

        if (ladoA == ladoB && ladoA == ladoC){
            System.out.println("el triangulo es equilatero");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            System.out.println("el triangulo es isosceles");

        }else {
            System.out.println("el triangulo es escaleno");
        }
    }
}
