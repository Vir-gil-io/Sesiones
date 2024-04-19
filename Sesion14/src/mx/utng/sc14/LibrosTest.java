package mx.utng.sc14;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibrosTest {
    public static void main(String[] args) {
        Queue<Libro> libros = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {

        libros.add(new Libro("Libro: "+(i+1),(int) Math.random()*10));
        }
        System.out.println(libros);

        Libro libro =  null;
        while ((libro = libros.poll()) !=null) {
            
            System.out.println(libro.getTITULO());
        }
    }

}
