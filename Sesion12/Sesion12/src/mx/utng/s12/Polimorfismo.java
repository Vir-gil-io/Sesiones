package mx.utng.s12;
/*
 * @author: Gilberto Fabián Correa González
 * @date: 6/02/2024
 * @group: GDS0624
 */
public class Polimorfismo {
    public static void main(String[] args) {
        //Crear un objeto v de la clase Venado
        Venado v =new Venado();

        Animal a =v;
        Hervivoro h =v;
        Object o =v;
        //Scanner s = v;

        System.out.println("Venado: "+(v instanceof Venado));
        System.out.println("Animal: "+(a instanceof Animal));
        System.out.println("Hervívoro: "+(h instanceof Hervivoro));
        System.out.println("Objeto: "+(o instanceof Object));
        //System.out.println("Scanner: "+(v instanceof Scanner));← NO HAY COMPATIBILIDAD
        v.comer();

        Humano humano =new Humano();
        humano.comer();
    }
}
