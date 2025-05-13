package Java8Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

    public static  void arrayListEje1(){
        ArrayList<String> frutas = new ArrayList<>();
        // ADD
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Mandarina");
        frutas.add("Mandarina");
        frutas.add("Mandarina");

        //* Mostrar mi lista
        System.out.println("Mi lista de frutas es: " + frutas);

        //* Insertar información en mi lista frutas
        frutas.add(1, "Uva");
        System.out.println("Mi lista de frutas es: " + frutas);

        //* Eliminar un elemento por su valor
        frutas.remove("Pera");
        System.out.println("Mi lista de frutas es: " + frutas);

        frutas.remove("Mandarina");
        System.out.println("Mi lista de frutas es: " + frutas);

        frutas.remove(2);
        System.out.println("Mi lista de frutas es: " + frutas);

        //* Obtener el valor
        String frutaObtenida = frutas.get(2);
        System.out.println("Lo que está en la posc 2 es: " + frutaObtenida);

        //* Buscar una fruta en la lista
        boolean siOno = frutas.contains("Manzana");
        System.out.println("Contiene o no contiene? : " + siOno);
    }

    public static void ejericicoLista(){
        ArrayList<String> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Buscar producto");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el producto: ");
                    String producto = scanner.nextLine();
                    productos.add(producto);
                    break;
                case 2:
                    System.out.print("Ingrese el producto a eliminar: ");
                    producto = scanner.nextLine();
                    productos.remove(producto);
                    break;
                case 3:
                    System.out.println("Productos en la lista:");
                    for (String p : productos) {
                        System.out.println("- " + p);
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el producto a buscar: ");
                    producto = scanner.nextLine();
                    if (productos.contains(producto)) {
                        System.out.println("El producto " + producto + " se encuentra en la lista.");
                    } else {
                        System.out.println("El producto " + producto + " no se encuentra en la lista.");
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
