//Gilberto Fabián Correa González
package mx.utng.s11.reto01;
import java.time.LocalDate;

public class DBA extends Empleado {
    private String herramientasConsulta;

    public DBA(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String herramientasConsulta) {
        super(nombre, edad, fechaNacimiento, salario);
        this.herramientasConsulta = herramientasConsulta;
    }

    public String getHerramientaConsultas() {
        return herramientasConsulta;
    }

    public String getHerramientasConsulta() {
        return herramientasConsulta;
    }

    public void setHerramientasConsulta(String herramientasConsulta) {
        this.herramientasConsulta = herramientasConsulta;
    }
    

    
}
