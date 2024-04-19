/*
 * @Author: Gilberto Fabián Correa González
 * Group: GDS0624
 * Date: 24/02/2024
 */
package mx.utng.s19;
public class Reto01 {
    public static void main(String[] args) {
        int cien=0;
        //Con Ciclo for:
        for (int i = 0; i <= 100; i++) {
            cien +=i;
        }
        System.out.println("La suma de los numeros 1 al 100 es: "+cien);
        /*Con fórmula
        System.out.println("===========================================================\n");
         cien=(100*(100+1))/2;
         System.out.println("La suma de los numeros 1 al 100 es: "+cien);
         */
    }
}
