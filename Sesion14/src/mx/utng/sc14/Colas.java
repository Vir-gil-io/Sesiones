package mx.utng.sc14;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
        //Objeto Cola
        Queue<String> cola = new PriorityQueue<>();
        Collections.addAll(cola, "Uno", "Dos", "Tres","Cuatro", "Cinco");

        for (String cadena : cola) {
            System.out.println(cadena);
            
        }
        System.out.println("<<---------------->>");

        String valor = null;
        while ((valor=cola.poll())!=null) {
            System.out.println(valor);
            
        }
        System.out.println(cola);

    }

}
