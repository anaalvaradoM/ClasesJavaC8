package Java9POOFundamentos.Persona;


public class Main {
    public static void main(String[] args) {
        // Creando un objeto usando el constructor vacío
        Persona persona1 = new Persona();
//        persona1.nombre = "Angie";
//        persona1.apellido = "Pérez";
//        persona1.edad = 30;

        // Mostrando los datos de persona1
        System.out.println("Datos de persona1:");
        persona1.mostrarDatos();

        System.out.println();

        // Creando un objeto usando el constructor con parámetros
        Persona persona2 = new Persona("Ana", "Alvarado", 25);

        // Mostrando los datos de persona2
        System.out.println("Datos de persona2:");
        persona2.mostrarDatos();
    }
}

