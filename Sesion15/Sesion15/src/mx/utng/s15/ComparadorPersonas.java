package mx.utng.s15;
import java.util.Collections;
import java.util.Comparator;

public class ComparadorPersonas implements Comparator<Persona>{
    @Override
    public int compare(Persona p1, Persona p2){
        String nomberCompletoPersona1=p1.getNombre()+p1.getApellidos();
        String nombreCompletoPersona2=p2.getNombre()+p2.getApellidos();
        return nomberCompletoPersona1.compareTo(nombreCompletoPersona2);
        Collections.addAll(personas, Persona1, Persona2);
        for (Persona persona : personas) {
            System.out.println(persona.getNombre()+""+persona.getApellidos());
        }
        for (Persona persona : personas) {
            System.out.println(Persona1.compareTo(persona));
        }

        Collections.sort(personas, new ComparadorPersonas());
        for (Persona persona : personas) {
            System.out.println(persona.getNombre()+""+persona.getApellidos());
        }

    }
}
