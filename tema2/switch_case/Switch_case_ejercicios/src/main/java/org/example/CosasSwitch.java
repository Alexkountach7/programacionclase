package org.example;

import java.util.Scanner;

public class CosasSwitch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int dia_de_la_semana = 2;

        switch (dia_de_la_semana){

            case 1:
            System.out.println("lunes");
            break;
            case 2:
            System.out.println("martes");
            break;
            case 3:
            System.out.println("miercoles");
            break;
            case 4:
            System.out.println("jueves");
            break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("dia no valido");
                break;

        }

    }
}
