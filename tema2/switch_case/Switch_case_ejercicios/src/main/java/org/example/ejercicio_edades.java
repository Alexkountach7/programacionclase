import java.time.LocalDateTime;
import java.util.Scanner;

public class ejercicio_edades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año_nacimiento = 0;
        int año_actual = LocalDateTime.now().getYear();

        System.out.println("Elige un modo:");
        System.out.println("[1] - Año de nacimiento");
        System.out.println("[2] - Edad");

        int modo;
        if (sc.hasNextInt()) {
            modo = sc.nextInt();
        } else {
            System.out.println("Introduce un valor válido.");
            sc.close();
            return;
        }

        if (modo == 1) {
            System.out.println("Introduce tu año de nacimiento:");
            if (sc.hasNextInt()) {
                año_nacimiento = sc.nextInt();
            } else {
                System.out.println("Formato inválido.");
                sc.close();
                return;
            }
        } else if (modo == 2) {
            System.out.println("Introduce tu edad:");
            if (sc.hasNextInt()) {
                int edad = sc.nextInt();
                if (edad < 0) {
                    System.out.println("La edad no puede ser negativa.");
                    sc.close();
                    return;
                }
                año_nacimiento = año_actual - edad;
            } else {
                System.out.println("Formato inválido.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Modo no válido.");
            sc.close();
            return;
        }

        sc.close();

        if (año_nacimiento < 1900 || año_nacimiento > año_actual) {
            System.out.println("Año fuera de rango.");
            return;
        }

        int codigo = 0;

        if (año_nacimiento <= 1927) {
            codigo = 1;
        } else if (año_nacimiento <= 1944) {
            codigo = 2;
        } else if (año_nacimiento <= 1964) {
            codigo = 3;
        } else if (año_nacimiento <= 1981) {
            codigo = 4;
        } else if (año_nacimiento <= 1994) {
            codigo = 5;
        } else {
            codigo = 6;
        }

        switch (codigo) {
            case 1:
                System.out.println("Generación no bautizada");
                break;
            case 2:
                System.out.println("Generación silent");
                break;
            case 3:
                System.out.println("Generación boomer");
                break;
            case 4:
                System.out.println("Generación X");
                break;
            case 5:
                System.out.println("Generación milenial");
                break;
            case 6:
                System.out.println("Generación Z");
                break;
            default:
                System.out.println("Generación desconocida");
                break;
        }
    }
}
