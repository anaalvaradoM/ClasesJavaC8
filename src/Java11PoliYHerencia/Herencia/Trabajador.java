package Java11PoliYHerencia.Herencia;

public class Trabajador extends Persona {

    int codigoTrabajador;
    String cargo;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String pais, int codigoTrabajador, String cargo) {
        super(nombre, apellido, pais);
        this.codigoTrabajador = codigoTrabajador;
        this.cargo = cargo;
    }

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void mostrarDatos(){
        System.out.println(getNombre() + " " + getCargo());
    }
}
