package Java7Funciones;

public class Metodos {
    public static void saludarSinArgu(){
        System.out.println("Hola, sin argumentos");
    }
    public static void saludar(String nombre){
        System.out.println("Hola, " + nombre);
    }
    public static void saludarConEdad(String nombre, int edad){
        System.out.println("Hola, " + nombre + " tienes " + edad);
    }

    //! METODOS CON RETORNO
    public static String generarSaludo(String nombre){
        return "Hola " + nombre;
    }

    public static void calcularTotal(double precio, int cantidad){
        double total = precio * cantidad;
        System.out.println("El total de tu compra es: $" + total );
    }

    public static double calcularTotalR(double precio, int cantidad){
        double resultado = precio * cantidad;
        return resultado;
    }

    public static double aplicandoDescuento(double total, double porcentaje){
        return total - (total * porcentaje / 100);
    }




}
