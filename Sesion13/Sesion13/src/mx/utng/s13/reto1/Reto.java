/*
 * @author: Gilberto Fabián Correa González
 * @date: 6/02/2024
 * @group: GDS0624
 */
package mx.utng.s13.reto1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Reto {
    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Plátanos");
        listaFrutas.add("Sandía");
        listaFrutas.add("Pera");
        listaFrutas.add("Manzana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Kiwi");

        Collections.reverse(listaFrutas); // Invierte el orden de los elementos
        System.out.println("Lista de frutas invertida: " + listaFrutas);

        String primerElemento = Collections.min(listaFrutas);// Encuentra el elemento más pequeño (alfabéticamente)
        System.out.println("El primer elemento en orden alfabético es: " + primerElemento);

        String ultimoElemento = Collections.max(listaFrutas);// Encuentra el elemento más grande (alfabéticamente)
        System.out.println("El último elemento en orden alfabético es: " + ultimoElemento);

        Collections.sort(listaFrutas);// Ordena la lista alfabéticamente
        System.out.println("Lista de frutas ordenada alfabéticamente: " + listaFrutas);

        int posicionPera = Collections.binarySearch(listaFrutas, "Pera");// Busca las posiciones de la Pera y 
        int posicionNaranja = Collections.binarySearch(listaFrutas, "Naranja");//la Naranja en la lista ordenada
        System.out.println("La Pera está en la posición: " + posicionPera);
        System.out.println("La Naranja está en la posición: " + posicionNaranja);

        for (int i = 0; i < 3; i++) {// Agrega tres Manzanas nuevas a la lista
            listaFrutas.add("Manzana");
        }
        System.out.println("Lista de frutas con tres Manzanas nuevas: " + listaFrutas);

        Collections.shuffle(listaFrutas);// Desordena los elementos de la lista
        System.out.println("Lista de frutas desordenada: " + listaFrutas);

        int cantidadManzanas = Collections.frequency(listaFrutas, "Manzana");// Cuenta cuántas manzanas
        System.out.println("Cantidad de Manzanas en la lista: " + cantidadManzanas);//hay en la lista
    }
}
