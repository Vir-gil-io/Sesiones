//Gilberto Fabian Correa Gonzalez

package mx.utng.sesion04;

public class LectorTest {
    public static void main(String[] args) {
        //Crea un objeto de tipo Lector
        Lector lector= new Lector();
        lector.muestraMensaje("Teclea tu nombre:");
        String nombre=lector.leerEntrada();
        lector.muestraMensaje("Hola "+nombre);

        lector.muestraMensaje("Hola", nombre);
    }
}
