package mx.utng.s12.reto01;
/*
 * @author: Gilberto Fabián Correa González
 * @date: 6/02/2024
 * @group: GDS0624
 */
public class PruebaFigura {
    public static void main(String[] args) {
        Figura Forma;

        Forma=new Triangulo(80, 40);
        Forma.formulaCalculaArea();

        Forma=new Cuadrado(50);
        Forma.formulaCalculaArea();

        Forma=new Rectangulo(50, 95);
        Forma.formulaCalculaArea();

    }
}
