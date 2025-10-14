package org.example;

public class StringCosas {
    static void main() {


        String frase = "Netanyahu le reagala una paloma de oro a Trump";

        int tamaño = frase.length();
        System.out.println(tamaño);

        System.out.println(frase.charAt(35));
        String trozo = frase.substring(38,45);
        System.out.println(trozo);

        String trozo2 = frase.substring(38); // va desde la 38 has el final
        System.out.println(trozo2);

        int posicion_oro = frase.indexOf("oro"); // buscar la palabra oro en la frase
        System.out.println(posicion_oro);
        int posicion_oro2 = frase.indexOf("oro",13);
        System.out.println(posicion_oro2);
        int posicion_oro_ultima = frase.lastIndexOf("oro");
        System.out.println(posicion_oro_ultima);

        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);
        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);

        String nombre = "IVAN                   ";
        System.out.println(nombre.trim() + " - "+nombre+ "#");  // trim quita espacios de delante y de detras
        String nombre_iva_mayus = nombre.toUpperCase();
        boolean iguales = nombre_iva_mayus.trim().equals("IVAN");
        System.out.println(iguales);

        boolean iguales2 = nombre.trim().equalsIgnoreCase("Ivan");
        System.out.println(iguales2);

        String cambiado = frase.replace("paloma","PalOmA");
        System.out.println(cambiado);

        String frase_concatenada = frase.concat("  de EEUU");
        System.out.println(frase_concatenada);
        System.out.println(frase+"  de EEUU");
    }
}