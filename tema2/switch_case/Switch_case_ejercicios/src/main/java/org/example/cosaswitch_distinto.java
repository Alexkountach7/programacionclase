package org.example;

import java.util.Scanner;

public class cosaswitch_distinto {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int dia_de_la_semana = 7;

        switch (dia_de_la_semana){

            case 1:
                System.out.println("lunes");

            case 2:
                System.out.println("martes");

            case 3:
                System.out.println("miercoles");

            case 4:
                System.out.println("jueves");

            case 5:
                System.out.println("viernes");
                System.out.println("entre semana");
                break;
            case 6:

            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("dia no valido");
                break;

        }

    }
}


