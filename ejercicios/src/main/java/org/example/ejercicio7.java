package org.example;

import java.util.Scanner;

public class ejercicio7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("tenemos tomate");
        String tomate = sc.nextLine();
        System.out.println("tenemos jamon");
        String jamon = sc.nextLine();
        System.out.println("tenemos aceite");
        String aceite = sc.nextLine();

        if(tomate.equalsIgnoreCase("no") || jamon.equalsIgnoreCase("no") || aceite.equalsIgnoreCase("no")){
            System.out.println("tenemos que ir a comprar");
        }else {
            System.out.println("no tenemos que ir a comprar");
        }

    }
}
