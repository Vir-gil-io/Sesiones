//Gilberto Fabian Correa Gonzalez
package mx.utng.s05.reto01;

public class RetoPrimitivos {
    public static void main(String[] args) {
        //Todos los tipos de datos primitivos e imprimir su valor mínimo y valor máximo
        //utilizando en una sola instrucción 
        //la función printf (byte, short, int, long, char, boolean, float, double)
        byte minByte= Byte.MIN_VALUE;
        byte maxByte= Byte.MAX_VALUE;
        System.out.printf("Bytes: %n Mínimo: %d, Máximo %d%n", minByte, maxByte);
        
        short minShort= Short.MIN_VALUE;
        short maxShort= Short.MAX_VALUE;
        System.out.printf("Short: %n Mínimo: %d, Máximo %d%n", minShort, maxShort);

        int minInt= Integer.MIN_VALUE;
        int maxInt= Integer.MAX_VALUE;
        System.out.printf("Enteros: %n Mínimo: %d, Máximo %d%n", minInt, maxInt);

        long minLong= Long.MIN_VALUE;
        long maxLong= Long.MAX_VALUE;
        System.out.printf("Long: %n Mínimo: %d, Máximo %d%n", minLong, maxLong);

        char minChar= Character.MIN_VALUE;
        char maxChar= Character.MAX_VALUE;
        System.out.printf("Caracter: %n Mínimo: %c, Máximo %c%n", minChar, maxChar);

        boolean minBoolean= Boolean.FALSE;
        boolean maxBoolean= Boolean.TRUE;
        System.out.printf("Booleanos: %n Mínimo: %b, Máximo %b%n", minBoolean, maxBoolean);

        float minFloat= Float.MIN_VALUE;
        float maxFloat= Float.MAX_VALUE;
        System.out.printf("Float: %n Mínimo: %f, Máximo %f%n", minFloat, maxFloat);

        double minDouble= Double.MIN_VALUE;
        double maxDouble= Double.MAX_VALUE;
        System.out.printf("Double: %n Mínimo: %s, Máximo %s%n", Double.toString(minDouble), Double.toString(maxDouble));



    }
}
