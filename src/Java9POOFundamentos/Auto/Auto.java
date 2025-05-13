package Java9POOFundamentos.Auto;

public class Auto {
    //! 1 Creo los atributos
    String color;
    String marca;
    int modelo;


    //* CONSTRUCTORES:
    //? Mismo nombre clase, no lleva void, no retorna nada, debe ser public
    public Auto() {
//       this.marca = "Desconocido";
//       this.modelo = 2;
//
    }

    public Auto(String color, String marca, int modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    //! 2 Métodos
    public void arrancar(){
        System.out.println(" El auto" + color + " arrancó ");
    }

    public void frenar(){
        System.out.println(" El carro frenó ");
    }


    public void mostrarDatos(){
        System.out.println("--Datos del carro: ---");
        System.out.println("Color carro: " + color);
        System.out.println("Marca carro: " + marca);
        System.out.println("Modelo carro: " + modelo);

    }

}
