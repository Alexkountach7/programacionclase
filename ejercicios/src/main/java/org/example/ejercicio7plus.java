package org.example;

import java.util.Scanner;

public class ejercicio7plus {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay jamon (s/n)");
        char jamon = sc.next().charAt(0);
        System.out.println("hay aceite (s/n)");
        char tomate = sc.next().charAt(0);
        System.out.println("hay tomate (s/N)");
        char aceite = sc.next().charAt(0);
        if (aceite == 's' && jamon == 's' && tomate == 's') {
            System.out.println("no tenemos que ir a comprar");
        }else {
            System.out.println("tenemos que ir a comprar");
        }
    }
}
