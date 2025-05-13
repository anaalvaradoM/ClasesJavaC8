package Java11PoliYHerencia.Polimorfismo;

public class VehiculoCarga extends Vehiculo{
    private int cargaMax;

    public VehiculoCarga() {
    }

    public VehiculoCarga(String marca, int modelo, String placa, int cargaMax) {
        super(marca, modelo, placa);
        this.cargaMax = cargaMax;
    }


    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nCapacidad max de carga: " + cargaMax;
    }
}
