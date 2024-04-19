package mx.utng.s13.ej1;

import java.time.LocalDate;
import java.time.Month;

public class Polimorfismo {
    public static void main(String[] args) {
        Profesor profe1=new Profesor("Laura", "Mireles Hernández", "UTNG00541");
        profe1.mostrarDatos();

        Profesor profe2=new ProfesorInterino("Andres", "Landeros Ortiz", "UTNG00624", 
        LocalDate.of(2024, Month.DECEMBER, 21));
        profe2.mostrarDatos();

        Persona p=new Persona("Claudia", "Solis");
        p=new Profesor(p.getNombre(), p.getApellidos(), "UTNG00001");
        p.mostrarDatos();
    }
}
