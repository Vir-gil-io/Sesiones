//Gilberto Fabian Correa Gonzalez
package mx.utng.s05.reto02;
import java.util.Scanner;
public class UsoIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificación de POO");
        int nota =scanner.nextInt();
        scanner.close();
        String mensaje= "";
       if (nota == 10) {
          mensaje= "Excelente";
       }else if (nota == 9 || nota == 8) {
          mensaje= "Muy bien";
       }else if (nota == 7) {
          mensaje= "Bien Hecho";
       }else if (nota == 6) {
          mensaje= "Pasaste";
       }else if (nota == 5) {
          mensaje= "Mejor vuelve a cursar";
       }else {
          mensaje= "Nota no válida";
       }
        System.out.println(mensaje);
   }
}
