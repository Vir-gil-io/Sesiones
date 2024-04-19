//Gilberto Fabian Correa Gonzalez
package mx.utng.s05;

public class Primitivos {
   public static void main(String[] args){
    //Entero muy pequeño (Rango: -128 al 127)
    byte valorByte = 10;
    System.out.println(valorByte);
    
    //Entero corto (Rango: -32768 al 32767)
    short valorShort =30000;

    //Entero base (Rango: -2147483648 al 2147483648)
    int valorInt = 2000000000; 

    //Entero más largo (Rango: -9223372036854775808l al 9223372036854775807l)
    long valorLong = 9223372036854775807l;

    //Número real, tiene punto decimal, es de 6 cifras después del punto
    float valorFloat= 1.0f;
    System.out.println("Flotante: "+valorFloat);

    //Numero real con precisión doble, 16 cifras después del punto
    double valorDouble= 3.5f;
    System.out.println("Double: "+valorDouble);

    //Valores Booleanos, con sólo dos valores posibles (true/false)
    boolean valorBoolean= true;

    //Primitivo para textos
    char valorChar= 'B';

    System.out.printf("Valor booleano: %b %n valor char: %c%n", valorBoolean, valorChar);

    float numFloat= 1.5f;
    int numInt1= (int)numFloat; //Se convierte un numero flotante a entero
    System.out.printf("Numero Flotante: %1.1f, Entero: %d%n", numFloat, numInt1);
    
    char numChar='M';
    numChar++;
    int numInt2= numChar;
    System.out.printf("Char: %c, Entero: %d%n", numChar, numInt2);


   }
}
