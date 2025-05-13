package Java9POOFundamentos.Persona;

public class Persona {
    // Atributos
    String nombre;
    String apellido;
    int edad;

    // Constructor vacío
    public Persona() {
        // No hace nada, pero permite crear objetos sin inicializar valores
    }

    // Constructor con parámetros
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Método para mostrar los datos de la persona
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }
}

