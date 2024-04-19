package mx.utng.s15;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PersonaTest {
    public static void main(String[] args) {
        Persona persona1=new Persona("Reynaldo", "Peña", 1.8F);
        Persona persona2=new Persona("Carolina", "Herrera", 1.6F);
        Persona persona3=new Persona("Guadalupe", "Esparza", 1.7F);
        Persona persona4=new Persona("Pedro", "Arriaga", 1.7F);
        Persona persona5=new Persona("Josué", "López", 1.5F);

        List<Persona> personas=new LinkedList<>();
        
        Collections.addAll(personas, persona1, persona2, persona3, persona4, persona5);
        for (Persona persona : personas) {
            System.out.println(persona.getNombre()+""+persona.getApellidos()+": "+persona.getEstatura());
        }

        //Comparando personas
        for (Persona persona : personas) {
            System.out.println(persona1.compareTo(persona));
        }


    }
}
