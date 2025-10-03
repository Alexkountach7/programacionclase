package org.example;

import java.util.Scanner;

public class ejercicioclasetryandcacht {
    static void main() {
        Scanner sc = new Scanner(System.in);
        boolean repetir = false;
        do {

            try {
                System.out.println("introduce un numero");
                int numero = sc.nextInt();
                repetir=false;
            }catch (Exception err){
                System.out.println("el formato introducido es el incorrecto");
                repetir=true;

            }
            sc.nextLine();
        }while (repetir==true);

    }
}