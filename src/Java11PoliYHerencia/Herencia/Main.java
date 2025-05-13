package Java11PoliYHerencia.Herencia;

public class Main {
    public static void main(String[] args) {

        Trabajador trabajador = new Trabajador("John", "Restrepo", "Colombia", 1234, "Desarrollador");

        trabajador.mostrarDatos();
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getCargo());

        Persona persona = new Persona("Ana", "Alvarado", "Colombia");
        System.out.println(persona.nombre);

        Externo externo = new Externo("Moni", "Calvo", "Colombia", "Meli", 123);
    }
}
