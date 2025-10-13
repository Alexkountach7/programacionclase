package org.example;

import java.util.Scanner;

public class practica_1_entregar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero1=0;
        int numero2=0;
        int resultado;
        boolean repetir = false;
        do {
            try {
                System.out.print("introduce el multiplicando (3 cifras): ");
                numero1 = sc.nextInt();
                System.out.print("introduce el multiplicador (3 cifras): ");
                numero2 = sc.nextInt();
                if (nu)
            }
        } while ((numero1>=100 && numero1<=999) || (numero2>=100 && numero2<=999) || (numero1<=-100 && numero1>=-999) ||(numero2<=-100 && numero2>=-999));

            resultado = numero1*numero2;
            System.out.println("el resultado es" +resultado);
    }
}
