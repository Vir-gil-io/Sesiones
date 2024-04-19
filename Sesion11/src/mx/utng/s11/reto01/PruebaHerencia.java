//Gilberto Fabián Correa González
package mx.utng.s11.reto01;
import java.time.LocalDate;
import java.time.Month;

public class PruebaHerencia {
    public static void main(String[] args) {
        Programador programador = new Programador("Gilberto", (byte)18, LocalDate.of(2005, Month.APRIL, 11), 
        20000.00f, "c++");                 //Casting para detectar el byte
        //Se muestran los datos del programador
        System.out.println("Datos del Programador: ");
        System.out.println("Nombre: "+ programador.getNOMBRE());
        System.out.println("Edad: "+ programador.getEDAD());
        System.out.println("Fecha de nacimiento: "+ programador.getFechaNacimiento());
        System.out.println("Salario: "+ programador.getSalario());
        System.out.println("Lenguaje principal: "+ programador.getLenguajePrincipal());
        System.out.println("");

        //Se muestran los datos del admin de base de datos
        DBA dba = new DBA("Cynthia Janeth Granados", (byte)18, LocalDate.of(2005, Month.OCTOBER, 12),
         40000.00f, "Oracle");           //Modo de asignación de fecha (año, mes y día)

         System.out.println("Datos del admin: ");
        System.out.println("Nombre: "+ dba.getNOMBRE());
        System.out.println("Edad: "+ dba.getEDAD());
        System.out.println("Fecha de nacimiento: "+ dba.getFechaNacimiento());
        System.out.println("Salario: "+ dba.getSalario());
        System.out.println("Herramientas de consulta: "+ dba.getHerramientasConsulta());
    }
}
