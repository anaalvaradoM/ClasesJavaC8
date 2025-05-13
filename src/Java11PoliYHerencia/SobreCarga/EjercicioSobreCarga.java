package Java11PoliYHerencia.SobreCarga;

public class EjercicioSobreCarga {

    //Overload del método

    public int suma (int a, int b){
        return a + b ;
    }

    public int suma (int a, int b, int c){
        return a + b + c;
    }

    public double suma (double a, double b){
        return a + b ;
    }

    public String suma(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        EjercicioSobreCarga opcion = new EjercicioSobreCarga();

        System.out.println("con 2: " + opcion.suma(4, 5));
        System.out.println("con 2: " + opcion.suma(4, 5, 5));
        System.out.println(opcion.suma("3", "5"));
    }

}
