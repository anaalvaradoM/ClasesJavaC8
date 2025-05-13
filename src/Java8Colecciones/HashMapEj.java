package Java8Colecciones;

import java.util.HashMap;
import java.util.Map;

public class HashMapEj {
        public static void ejemploHashMap(){

            Map<String, Double> inventario = new HashMap<>();
            System.out.println(" Bienvenidxs a la fruteria: ");

            inventario.put("Manzana" , 1.40);
            inventario.put("Mandarina" , 2.40);
            inventario.put("Uvas" , 5.40);
            inventario.put("Papaya" , 3.40);
            inventario.put("Sandia" , 7.40);


            System.out.println("Nuestro inventario: ");
            for(String fruta : inventario.keySet()){
                System.out.println(fruta + ": $" + inventario.get(fruta) );
            }

            //! Se acerca el cliente y nos pide:
            String frutaCliente = "Mandarina";
            System.out.println("El cliente pidió " + frutaCliente);

            if(inventario.containsKey(frutaCliente)){
                System.out.println("Si tenemos, " + frutaCliente);
            } else {
                System.out.println("No tenemos, " + frutaCliente);
            }

            System.out.println("Compra realizada ");

            inventario.remove("Mandarina");

            System.out.println("Inventario actualizado ");
            for(String fruta : inventario.keySet()){
                System.out.println(fruta + ": $" + inventario.get(fruta) );
            }

        }
}












