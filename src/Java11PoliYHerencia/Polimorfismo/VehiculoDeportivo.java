package Java11PoliYHerencia.Polimorfismo;

public class VehiculoDeportivo extends  Vehiculo{
    private int hP;


    public VehiculoDeportivo(String marca, int modelo, String placa, int hP) {
        super(marca, modelo, placa);
        this.hP = hP;
    }

    public int gethP() {
        return hP;
    }

    public void sethP(int hP) {
        this.hP = hP;
    }


    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nCaballos de fuerza: " + hP;
    }
}
