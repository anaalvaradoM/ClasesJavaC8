package java6Loops;

import java.util.Scanner;

public class DoWhile {
    // Hacer - mientras
    public static void ejercio1DoWhile(){
        int num = 11;
        do{
            System.out.println(num);
            num++;
        } while (num <=10) ;
    }

    public static void ejemplo2DoWhile(){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Menú: ");
            System.out.println("1. Pizza ");
            System.out.println("2. Hamburguesas ");
            System.out.println("3. Empanadas ");
            System.out.println("4. Salir ");
            System.out.println("Elija una opción ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu pizza va en camino");
                    break;
                case 2:
                    System.out.println("Tu hb va en camino");
                    break;
                case 3:
                    System.out.println("Tu em va en camino");
                    break;
                case 4 :
                    System.out.println("Gracias por venir");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion != 4 );
        scanner.close();
    }

}
