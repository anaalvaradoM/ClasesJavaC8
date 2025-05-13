package Java9POOFundamentos.Estudiante;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Aleja", "Paiva", 1234);

        //System.out.println(estudiante2.nombre);
        System.out.println("El name del estu2 es: " + estudiante2.getNombre());

        //opcion2
        String apellido = estudiante2.getApellido();
        System.out.println("El apellido del estu2 es: " + apellido);

        //! ahora vamos con es estudiiante1
        estudiante1.setNombre("Pedro");
        estudiante1.setApellido("Picapiedra");
        estudiante1.setCodigo(5678);

        System.out.println("---Mostra info estudiante 1");
        System.out.println("Nombre estudiante 1: " + estudiante1.getNombre());
        System.out.println("Apellido estudiante 1: " + estudiante1.getApellido());
        System.out.println("Codigo estudiante 1: " + estudiante1.getCodigo());


        //! Cambiar el codigo de Aleja
        estudiante2.setCodigo(8888);
        System.out.println("Ahora el cod de Aleja es: " + estudiante2.getCodigo());



    }
}
