package mx.utng.s15;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibroTest {
    public static void main(String[] args) {
        Queue<Libro> libros=new PriorityQueue<>();
        libros.add(new Libro ("Libro1", 4));
        libros.add(new Libro("Libro2", 2));
        libros.add(new Libro("Libro3", 4));
        libros.add(new Libro("Libro4", 4));
        libros.add(new Libro("Libro5", 2));
        libros.add(new Libro("Libro6", 2));
        libros.add(new Libro("Libro7", 4));
        libros.add(new Libro("Libro8", 3));
        libros.add(new Libro("Libro9", 3));
        libros.add(new Libro("Libro10", 9));

        Libro libro=null;

        while ((libro=libros.poll())!=null) {
            System.out.println(libro.getTitulo());
        }


    }
}
