package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura=0;
        double peso=0;
        double pesominimo;
        double totalpeso;
        double pesomax;
        double pesoconst=120;
        double alturaminconst=140;
        double alturamaxconst=230;
        System.out.println("------------------------------");
        System.out.println("***Bienvenido al raton jugueton***");
        System.out.println("------------------------------");
        try {
            System.out.println("introduce tu altura");
            altura = sc.nextDouble();
        } catch (InputMismatchException err) {
            System.out.println("introduce un valor valido");
            return;
        }
        System.out.println("leyendo altura (cm) ......");
        if (altura > alturamaxconst || altura <= 0) {
            System.out.println("Error de lectura, baja de la bascula y vuelve a subir...");
        } else if (altura < alturaminconst) {
            double diferenciacm = alturaminconst - altura;
            System.out.println("para subir a la atraccion te faltan: " + diferenciacm + "cm");
        } else {
            System.out.println("altura correcta");
        }
        try {
            System.out.println("introduce tu peso");
            peso = sc.nextDouble();
        } catch (InputMismatchException err) {
            System.out.println("introduce un valor valido");
            return;
        }
        System.out.println("Leyendo peso....");
        pesominimo = (peso * 2 / 8);
        if (peso < pesominimo) {
            totalpeso = peso - pesominimo;
            System.out.println("Lo siento, no superas el peso minimo requerido para subir a la atraccion");
        } else if (peso > pesoconst) {
            pesomax = peso - pesoconst;
            System.out.println("Lo sineto, sobrepasas en " + pesomax + " kg el limite de la atraccion");

        } else {
            System.out.println("pesas " + peso + " kg, peso minimo calculado: " + pesominimo);
            System.out.println("¡¡Sube a la atraccion!!");
        }

    }
}
