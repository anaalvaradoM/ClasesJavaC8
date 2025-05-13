package Java11PoliYHerencia.Abstractas;

public abstract class Figura {
    protected double x;
    protected double y;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // No tiene implementación en esta clase
    public abstract double calcularArea();

    public void verDatos(){
        System.out.println("Salgo desde clase abstracta ");
    }


}
