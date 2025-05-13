package Java11PoliYHerencia.Polimorfismo;

public class Vehiculo {
    protected String marca;
    protected int modelo;
    protected String placa;

    public Vehiculo() {
    }

    public Vehiculo(String marca, int modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String mostrarDatos(){
        return "marca: " + marca + "placa: " + placa + "modelo: " + modelo;
    }
}
