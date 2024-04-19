//Gilberto Fabián Correa González
package mx.utng.s11.reto01;
import java.time.LocalDate;

public class Empleado extends Persona {
    private float SALARIO;

    public Empleado(String nombre, byte edad, LocalDate fechaNacimiento, float salario) {
        super(nombre, edad, fechaNacimiento);
        this.SALARIO = salario;
    }

    public float getSalario() {
        return SALARIO;
    }

    public void setSALARIO(float salario) {
        SALARIO = salario;
    }
    
    
}
