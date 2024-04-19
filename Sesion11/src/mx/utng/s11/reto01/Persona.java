//Gilberto Fabián Correa González
package mx.utng.s11.reto01;
import java.time.LocalDate;

public class Persona {
    private String NOMBRE;
    private byte EDAD;
    private final LocalDate fechaNacimiento;

    public Persona(String nombre, byte edad, LocalDate fechaNacimiento) {
        this.NOMBRE = nombre;
        this.EDAD = edad;
        this.fechaNacimiento=fechaNacimiento;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String nombre) {
        NOMBRE = nombre;
    }

    public byte getEDAD() {
        return EDAD;
    }

    public void setEDAD(byte edad) {
        EDAD = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }    

}
