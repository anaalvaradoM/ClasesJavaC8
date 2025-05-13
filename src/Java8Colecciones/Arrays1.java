package Java8Colecciones;

import java.util.Arrays;

public class Arrays1 {
    public static void arrayEjer1(){
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        String[] nombres = {"Jorge", "Anderson", "Moni"};

        //! Acceder a una posición:

        int posicionX = numeros[3];

        String unNombre = nombres[1];

        System.out.println(posicionX);
        System.out.println(unNombre);


        //! Modificar un valor
        numeros[2]  = 8;
        nombres[1] = "Carlos";

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(nombres));

        //! Recorrer el array
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Desde el for: " + numeros[i]);
        }

        for (int numero : numeros ){
            System.out.println("Desde el nuevo: " + numero);
        }

        for (String xNombre : nombres){
            System.out.println("Nombres desde el nuevo for: " + xNombre);
        }
    }

}
