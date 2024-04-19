//Gilberto Fabian Correa Gonzalez
package mx.utng.sesion04;

import mx.utng.sesion04.Lector;
public class Letras {
    public static void main(String[] args) {
        //Objetos necesarios
        Lector lector= new Lector();
        ContadorCaracteres contador= new ContadorCaracteres();
        //Uso el lector para imprimir texto y leer valores
        lector.muestraMensaje("Teclea una palabra: ");
        String palabra = lector.leerEntrada();

        //Usar el contador para saber cuantos caracteres hay por cada tipo 
        int vocales=contador.cuentaVocales(palabra);
        lector.muestraMensaje("El numero de vocales es: "+vocales);
        int consonantes=contador.cuentaConsonantes(palabra);
        lector.muestraMensaje("El numero de consonantes es: "+consonantes);
        int numeros=contador.cuentaNumeros(palabra);
        lector.muestraMensaje("La cantidad de numeros es: "+numeros);
        int simbolos=contador.cuentaSimbolos(palabra);
        lector.muestraMensaje("El numero de simbolos es: "+simbolos);
    }
}
