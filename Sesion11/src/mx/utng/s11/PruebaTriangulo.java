package mx.utng.s11;
//Gilberto Fabián Correa González
public class PruebaTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5.0, 4.0, "Color Pastel");
        System.out.println("Info. del Triangulo: ");
        triangulo.mostrarDimension();
        triangulo.mostrarEstilo();
        System.out.println("Su area es: "+triangulo.area());

        Triangulo triangulo2 = new Triangulo(6.0, 9.0, "Color azul");
        System.out.println("Info. del Triangulo: ");
        triangulo2.mostrarDimension();
        triangulo2.mostrarEstilo();
        System.out.println("Su area es: "+triangulo2.area());

        Triangulo triangulo3 = new Triangulo(8.0, 12.0, "Color morado");
        System.out.println("Info. del Triangulo: ");
        triangulo3.mostrarDimension();
        triangulo3.mostrarEstilo();
        System.out.println("Su area es: "+triangulo3.area());
    }
}
