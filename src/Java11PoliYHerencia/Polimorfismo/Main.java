package Java11PoliYHerencia.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Vehiculo[] misCarros = new Vehiculo[3];

        misCarros[0] = new Vehiculo("Chevrolet", 2025, "ABC123");
        misCarros[1] = new VehiculoCarga("renult", 2025, "def456", 5000);
        misCarros[2] = new VehiculoDeportivo("Tesla", 2026, "poi789", 500);

        for (Vehiculo vehiculos : misCarros){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println(" ");
        }


        Vehiculo misCarro1 = new Vehiculo("Chevrolet", 2025, "ABC123");
        Vehiculo misCarros2 = new VehiculoCarga("renult", 2025, "def456", 5000);
        Vehiculo misCarros3 = new VehiculoDeportivo("Tesla", 2026, "poi789", 500);



    }
}
