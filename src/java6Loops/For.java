package java6Loops;

import java.util.Scanner;

public class For {
    public static void ejercicio1For() {

        for (int contador = 10; contador > 0; contador--) {
            System.out.println("Estoy en la vuelta #: " + contador);
        }
        System.out.println("----------");
        for (int contador = 0; contador < 10; contador++) {
            System.out.println("Estoy en la vuelta #: " + contador);
        }
    }
    public static void ForEj2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = entrada.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
