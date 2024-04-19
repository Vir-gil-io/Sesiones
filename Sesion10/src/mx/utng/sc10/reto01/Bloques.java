package mx.utng.sc10.reto01;

public class Bloques {
    private static final int valor;
    
    // Inicialización estática
    static {
      valor = 42; // Puedes establecer el valor de tu preferencia
    }
    
    // Método para mostrar el valor
    public static void muestraValor() {
        System.out.println("El valor es: " + valor);
    }
    
    // Otros métodos, constructores, etc. si es necesario...
    
    public static void main(String[] args) {
        Bloques bloques = new Bloques();
        Bloques.muestraValor();
    }
    
    
}
