package TallerDeOperadoresLogicos;

public class Main {
    public static void main(String[] args) {

        // Comparación

        System.out.println("Igualdad: " + (100 != 10));
        System.out.println(100 > 10);
        System.out.println(100 >= 10);
        System.out.println(100 < 10);
        System.out.println(100 <= 10);

        // Lógicos
        System.out.println(100 > 10 && 50 > 5);
        System.out.println(100 > 10 && 50 < 5);
        System.out.println(100 > 10 || 50 > 5);
        System.out.println(5 == 5  || 7 > 5);
        System.out.println(5 == 6  || 7 > 5);

        System.out.println(!(5 == 5));
        System.out.println(!true);
        System.out.println(189 != 5);







    }
}
