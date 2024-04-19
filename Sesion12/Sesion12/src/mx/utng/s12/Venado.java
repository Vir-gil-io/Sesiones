package mx.utng.s12;
/*
 * @author: Gilberto Fabián Correa González
 * @date: 6/02/2024
 * @group: GDS0624
 */
public class Venado extends Animal implements Hervivoro {
    
    @Override
    public void comer(){
        System.out.println("Comiendo pasto");
    }

}
