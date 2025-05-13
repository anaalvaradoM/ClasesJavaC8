package Java5Controlflow;

import java.util.Scanner;

public class IfElse {
    public static void teoria() {
        //! Estructura más básica para
        //! controlar la direcicón de mi programa
        //* Sintaxis
//        if(condicion) {
//             lo que sea que tenga que pasar
//        } else {
//             lo otro que tiene  pasar
//        }
    }

    public static void soloIf(int edad) {
        //int edad = 25;
        if (edad >= 18) {
            System.out.println("Muy bien puedes ingresar");
        }
        System.out.println("Holii desde afuera del if");
    }

    public static void ifconElse(int edad) {
        if (edad >= 18) {
            System.out.println("Muy bien puedes ingresar");
        } else {
            System.out.println("No, no puedes ingresar");
        }
        System.out.println("Holii desde afuera del if");
    }

    public static void notasDobleIf(int nota) {
        if (nota >= 90) {
            System.out.println("Pasó");
        } else if (nota >= 70) {
            System.out.println("Pasó raspando");
        } else {
            System.out.println("Lo siento, perdiste el año");
        }
    }


    public static void parOimpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    public static void ifDentroDeIf() {
        System.out.println("Ingresar su edad: ");
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();
        int saldo = 60;
        if (edad > 18 && saldo > 60) {
            System.out.println("Entre pues, tienes más de 18");
            if (saldo > 60) {
                System.out.println("Tiene la edad y el dinero para entrar ");
            } else {
                System.out.println("Tienes entre 18 y 60 ");
             }
        } else {
            if (edad == 18){
                System.out.println("Genial, tienes 18");
            } else {
                System.out.println("Lo siento, eres menor de 18");
            }

        }
    }
}



