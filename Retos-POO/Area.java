//Gilberto Fabian Correa Gonzalez
package mx.utng.s08;

public class Area {
    public static void main(String[] args) {
         Rectangulo R1= new Rectangulo();
         System.out.println("Area de un rectángulo cuyos valores son 0: "+R1.area());

         Rectangulo R2= new Rectangulo(2);
         System.out.println("Area de un rectángulo cuyos valores son 2: "+R2.area());

         Rectangulo R3= new Rectangulo(3,2);
         System.out.println("Area de un rectángulo de 3 de altura y 2 de ancho: "+R3.area());
    }
}

