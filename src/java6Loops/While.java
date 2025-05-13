package java6Loops;

import java.util.Scanner;

public class While {
    public static void ejercicio1While() {
        //! controlado por contador
        int contador = 0;
        while (contador < 10) {
            System.out.println("Estoy en la vuelta: " + contador);
            contador++;
        }
        System.out.println("Así va mi variable: " + contador);
    }

    public static  void ejercicio2While(){
        boolean bandera = true;
        Scanner scanner = new Scanner(System.in);
        String decision;

        while(bandera) {
            System.out.println("¿Desea ud pasar el curso si/no?");
            decision = scanner.nextLine();

            if (decision.equalsIgnoreCase("si")) {
                System.out.println("Listoo paselo pues!!");
                bandera = false;
            } else {
                System.out.println("Pero siga intentado");
                break;
            }
        }
        System.out.println("Geniall");
    }

    public  static void NumeroHasta(){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Ingrese números para sumar (0 para terminar):");

        // Pedir el primer número
        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();

        while (numero != 0) {
            suma += numero;
            // Sumar el número al total

            // Pedir el siguiente número
            System.out.print("Ingrese otro número: ");
            numero = scanner.nextInt();
        }
        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}
