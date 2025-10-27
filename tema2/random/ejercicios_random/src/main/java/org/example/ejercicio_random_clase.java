package org.example;

import java.util.Random;

public class ejercicio_random_clase {
    static void main() {
        Random aleatorio =new Random();
        int numero = aleatorio.nextInt(9)+1; // +1 es de donde empiezo

        System.out.println(numero);

    }
}
