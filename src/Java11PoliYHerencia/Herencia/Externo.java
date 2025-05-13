package Java11PoliYHerencia.Herencia;

public class Externo extends Persona{
    String empresaAsociada;
    int rut;

    public Externo() {
    }

    public Externo(String nombre, String apellido, String pais, String empresaAsociada, int rut) {
        super(nombre, apellido, pais);
        this.empresaAsociada = empresaAsociada;
        this.rut = rut;
    }

    public String getEmpresaAsociada() {
        return empresaAsociada;
    }

    public void setEmpresaAsociada(String empresaAsociada) {
        this.empresaAsociada = empresaAsociada;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre() + " " + "Rut:" + getRut());
    }
}
