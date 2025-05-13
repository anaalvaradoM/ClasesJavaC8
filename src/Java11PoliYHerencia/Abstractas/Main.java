package Java11PoliYHerencia.Abstractas;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(10, 5, 10);
        Cuadrado cuadrado = new Cuadrado(5, 7, 20);
       // Figura figura = new Figura();  NO SE PUEDE HACER
        Figura circulo2 = new Circulo(12,12,12);


        circulo.verDatos();
        cuadrado.verDatos();
        circulo.desdeCirculo();
        System.out.println("Area: " + circulo.calcularArea());
        circulo2.verDatos();







    }
}
