package Java11PoliYHerencia.Abstractas;

public class Circulo extends Figura{
    private final double radio;

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public void desdeCirculo(){
        System.out.println("Esto sale desde circulo");
    }


}
