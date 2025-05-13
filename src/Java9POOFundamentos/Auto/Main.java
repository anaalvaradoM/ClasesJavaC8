package Java9POOFundamentos.Auto;

public class Main {
    public static void main(String[] args) {

        //? Usamos el constructor vacío
        Auto auto1 = new Auto();
        System.out.println(auto1.marca);

        //? Constructor con parámetros
        Auto autoConPametros = new Auto("Negro", "N/A", 2005);
        System.out.println(autoConPametros.modelo);
        autoConPametros.mostrarDatos();























//        //! Creo mi objeto
//        Auto auto = new Auto();
//        //! Asignamos valores
//        auto.color = "Rojo";
//        auto.modelo = 2025;
//        auto.marca = "Tesla";
//
//        System.out.println(auto.color );
//        System.out.println(auto.modelo );
//        System.out.println(auto.marca);
//
//
//        Auto auto3 = new Auto();
//        //! Asignamos valores
//        auto3.color = "Verde";
//        auto3.modelo = 2025;
//        auto3.marca = "BMW";
//        System.out.println("----Datos auto2----");
//        System.out.println(auto3.color );
//        System.out.println(auto3.modelo );
//        System.out.println(auto3.marca);
//
//
//
//        //! USANDO LOS MÉTODOS
//        auto.mostrarDatos();
//        auto.arrancar();
//
//        auto3.mostrarDatos();
//        auto3.frenar();

    }


}
