package Java7Funciones;

public class Calculadora {

    public static int suma(int a, int b){
        return a +b;
    }
    public static int resta(int a, int b){
        return a - b;
    }
    public static int multi(int a, int b){
        return a * b;
    }

    public static double dividir(int a, int b){
        if (b == 0){
            System.out.println("Error: no puedes div entre cero");
            return 0;
        }
        return (double) a / b ;
    }


}
