package mx.utng.s12.reto01;
/*
 * @author: Gilberto Fabián Correa González
 * @date: 6/02/2024
 * @group: GDS0624
 */
public class Triangulo implements Figura {
    private double base;
    private double altura;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public void formulaCalculaArea(){
    System.out.println("El área de un triángiulo de base: "+base+" y altura: "+altura+ " es: "+(base*altura)/2);;
    }
}
