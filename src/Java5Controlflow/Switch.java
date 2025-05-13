package Java5Controlflow;

import java.util.Scanner;

public class Switch {
    //! Cuando tenemos muchas condiciones,
    //! switch es mejor que múltiples if-else
    public static  void teoria(){
//    switch (variable) {
//        case valor1:
//             Código
//            break;
//        case valor2:
//             Código
//            break;
//        default:
//            Código si no coincide ningún caso
//    }
    }

    public static void calificaciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion: ");
        String calificacion = scanner.nextLine();

        switch (calificacion.toLowerCase()){
            case "a":
                System.out.println("Pasaste");
                break;
            case "b":
                System.out.println("Pasaste raspando");
                break;
            default:
                System.out.println("Calificación no valida");
        }
    }

    public static void diaSemana(){
        int dia;
        String nombreDia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un num del 1 al 7: ");
        dia = scanner.nextInt();

        switch (dia){
            case 1:
                nombreDia="lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
        }
        System.out.println("El día es: " + nombreDia);
    }
}
















