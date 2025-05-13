package Java8Colecciones;

import java.util.HashSet;
import java.util.Set;

public class SetEjem {

    public static void ejemplHashSet() {
        //Asistencia

        System.out.println("Hello. bienvenidxs a la clase: ");
        Set<String> susNombres = new HashSet<>();

        susNombres.add("Tefa");
        susNombres.add("Vero");
        susNombres.add("Andres");
        susNombres.add("Jorge");
        susNombres.add("Dani");
        susNombres.add("Lizet");

        if (susNombres.contains("Vero")) {
            System.out.println("Si, si está en clase");
        } else {
            System.out.println("No, está capando clase");
        }

        //! Luego le dio por llegar a Migue
        susNombres.add("Migue");
        susNombres.add("Migue");
        susNombres.add("Migue");
        susNombres.add("Migue");
        susNombres.add("Migue");
        susNombres.add("Migue");
        susNombres.add("Migue");
        susNombres.add("migue");

        //! Alguien se salió de clase
        susNombres.remove("Jorge");

        //! El zoom está lleno o no ?
        if(susNombres.isEmpty()){
            System.out.println(" No hay nadie en clase");
        } else {
            System.out.println("Sii, aún hay  " + susNombres.size() + " learners");
        }

        System.out.println("Entonces, ¿Quién se quedó en clase?... ");
        for (String nombreLearner : susNombres ){
            System.out.println(nombreLearner);
        }

    }
}
