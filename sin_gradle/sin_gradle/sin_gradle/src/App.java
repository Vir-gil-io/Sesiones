//Gilberto Fabián Correa González
import mx.utng.ejercicio001.Autor;
import mx.utng.ejercicio001.Libro;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor = new Autor();
        autor.setName("Panchito");
        autor.setApellido("Torres");
        autor.setEdad(18);

        Libro libro = new Libro();
        libro.setTit("Reglas para seducir");
        libro.setAut(autor);
        libro.setNumpag(30);

        System.out.println("Libro: "+libro.getTit());
        System.out.println("Autor: "+libro.getAut().getName()+" "+libro.getAut().getApellido());
        

        
    }
}
