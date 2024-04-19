//Gilberto Fabian Correa Gonzalez
package mx.utng.s06.reto01;

import java.util.Scanner;

public class NumerosPares {
public static void main(String[] args) {
    //Utilizando el modulo poner todos los numeros
    //pares que hay en un rango dado por el usuario
    //inicio, fin, i
    //ciclo for o while o do while, if
    Scanner h =new Scanner(System.in);
    System.out.println("Teclea el inicio del rango de numeros:");
    int inicio=h.nextInt();
    System.out.println("Teclea el fin del rango de numeros");
    int fin=h.nextInt();
    System.out.println("");
    System.out.println("Los números pares que hay entre ese rango son:");
    h.close();
    for (int i = inicio; i <=fin; i++) {
        if (i%2 ==0) {
            System.out.println(i);
        }
    }
}
}
