package org.example;

import java.util.Scanner;

public class calculadora_switch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** BIENVENIDO A LA CALCULADORA RAPIDA ***");
        System.out.println("introduce un operando: ");
        int primeroperando = sc.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("[+] -> sumar");
        System.out.println("[-] -> restar");
        System.out.println("[x] -> multiplicar");
        System.out.println("[/] -> dividir");
        System.out.println("[R] -> raiz cuadrada");

        System.out.println("------------------------------------------------");

        System.out.println("Elige una operacion");
        String operacion = sc.nextLine();
        System.out.println("introduce el segundo operando");
        int segundooperando = sc.nextInt();

        switch (operacion){
            case "+":
                int sumar = primeroperando +segundooperando;
                System.out.println(sumar);
                break;
            case "-":
                int restar = primeroperando - segundooperando;
                System.out.println("resta");
                break;
            case "*":
                int multiplicacion = primeroperando * segundooperando;
                System.out.print(multiplicacion);
                break;
            case "/":
                int dividir = primeroperando/segundooperando;
                System.out.println(dividir);
                break; 
            case "R":


        }
    }
}
