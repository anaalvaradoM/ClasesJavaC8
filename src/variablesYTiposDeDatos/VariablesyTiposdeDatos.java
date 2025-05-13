package variablesYTiposDeDatos;

import java.util.Scanner;

public class VariablesyTiposdeDatos {
    public static void ejercicio1() {
        //!VARIABLES: ESPACIO DE MEMORIA, TIENE UN NOMBRE ASOCIADO

        //* Declaración: tipo de dato, nombre, pero sin valor inicial
        //* Definición: tipo de dato, nombre, con o  sin valor inicial
        //* Asignación: Damos un valor a la variable ya declarada

        //! tipoDeDato nombreVariable

        int numeroUno = 5;
        int numeroDos;
        numeroDos = 4;

        //? Tipos de datos primitivos:
        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807L;

        System.out.println("Byte: " + numByte);
        System.out.println("Short: " + numShort);
        System.out.println("Int: " + numInt);
        System.out.println("Long: " + numLong);

        //? Tipos de datos reales float y double
        //? Float ocupa 4 bytes
        //? Double ocupa 8 bytes

        double numDouble = 0.123456789012345;
        float numFloat = 0.123456789012345F;

        System.out.println("double: " + numDouble);
        System.out.println("float: " + numFloat);

        //! Tipo de dato Boolean

        boolean t = true;
        boolean f = false;

        System.out.println("True: " + t);
        System.out.println("False: " + f);

        //! String
        char letra = 'A';

        String cadenaTexto = "abcd";
        System.out.println("Cadena: " + cadenaTexto);
        System.out.println(cadenaTexto.toUpperCase());
        System.out.println(cadenaTexto.toLowerCase());
        System.out.println(cadenaTexto.length());

        //* INFERENCIA

        var numEntero = 10;
        System.out.println("Num entero: " + numEntero);

        var nombre = "Jorge";
        System.out.println("Nombre: " + nombre);

        //* CASTEO
        int miEntero = 8;
        System.out.println(miEntero);
        double miDouble = miEntero;
        System.out.println(miDouble);

        double miOtroDouble = 10.5D;
        System.out.println(miOtroDouble);
        int miOtroEntero = (int) miOtroDouble;
        System.out.println(miOtroEntero);


        //! Operadores Aritmeticos:

        System.out.println("Suma: " + (100 + 10));
        System.out.println("Resta: " + (100 - 10));
        System.out.println("Multi: " + (100 * 10));
        System.out.println("Div: " + (100 / 10));
        System.out.println("Modulo: " + (100 % 10));

        int miEnter = 100;
        System.out.println(miEnter);
        miEnter++;
        System.out.println(miEnter);
        miEnter--;
        System.out.println(miEnter);

        //! Asignación

        int miEntero2 = 200;
        System.out.println(miEntero2 + 10);
        System.out.println(miEntero2);
        System.out.println(miEntero2 += 10);
        System.out.println(miEntero2); //!210
        System.out.println(miEntero2 -= 10);
        System.out.println(miEntero2 *= 10);
        System.out.println(miEntero2 /= 10);
        // System.out.println(miEntero2 %= 10);
        System.out.println("El valor final: " + miEntero2);

        //! Interacción

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String miNombre = scanner.nextLine();
        System.out.println("Este es mi nombre: " + miNombre);

        scanner.close();



    }
}
