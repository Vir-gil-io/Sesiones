package mx.utng.s14;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class ColasTest {
    public static void main(String[] args) {
    
    //Crear objeto Cola
    Queue<String> cola=new PriorityQueue<>();
    Collections.addAll(cola, "uno", "dos", "tres", "cuatro", "cinco");
    for (String cadena: cola){
        System.out.println(cadena);
    }
    System.out.println("=================");
    String valor= null;
    while((valor=cola.poll())!=null){
        System.out.println(valor);
    }
    System.out.println(cola);
}
}
