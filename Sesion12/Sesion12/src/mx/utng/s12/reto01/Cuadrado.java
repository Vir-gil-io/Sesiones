package mx.utng.s12.reto01;
/*
 * @author: Gilberto Fabián Correa González
 * @date: 6/02/2024
 * @group: GDS0624
 */
public class Cuadrado implements Figura {
    
   private double lado;
  public double getLado() {
      return getLado();
    }
    public void setLado(double lado) {
      this.lado = lado;
    }
    
  public Cuadrado(double lado) {
      this.lado = lado;
    }
  @Override
   public void formulaCalculaArea(){
    System.out.println("El área de un cuadrado de lado: "+lado+" es: "+(lado*lado));

  }
}
