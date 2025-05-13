package Java7Funciones;

import static Java7Funciones.Calculadora.*;
import static Java7Funciones.Metodos.*;

public class Main {
    public static void main(String[] args) {

//        Metodos.saludarSinArgu();
//        Metodos.saludar("Ana");
//        Metodos.saludar("Pedro");
//        Metodos.saludarConEdad("Ana", 50);
//        Metodos.saludarConEdad("Pedro", 50);

        //! LLamando al método con retorno String

//        String saludo = generarSaludo("Ana");
//        System.out.println(saludo);
//        System.out.println(saludo.toUpperCase());



        //! COMPARACIÓN ENTRE VOID Y RETURN

        //  Metodos.calcularTotal(100, 3);
        //! Pruebas con return
//        double total = calcularTotalR(100, 3);
//
//        double totalDescuento = aplicandoDescuento(total, 10);
//
//        System.out.println("Total sin descuento: $" + total);
//        System.out.println("Total con descuento: $" + totalDescuento);


        //! PRUEBAS CON LA CALCULADORA
        int a = 10; int b = 3;

        int suma = suma(10,2);
        int resta = resta(10,2);
        int multi = multi(10,2);
        int dividir = (int) dividir(10,2);


        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la suma es: " + resta);
        System.out.println("El resultado de la suma es: " + multi);
        System.out.println("El resultado de la suma es: " + dividir);









    }
}















