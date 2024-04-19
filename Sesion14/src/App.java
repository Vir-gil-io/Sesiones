import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int contador= 0;
        String[] cadenas = new String[6];
        cadenas[0] = "Zanahoria";
        cadenas[1] = "Cilantro";
        cadenas[2] = "Lechuga";
        cadenas[3] = "Repollo";
        cadenas[4] = "Coliflor";
        cadenas[5] = "Jicama";



     
        for (String c : cadenas) {
            contador++;
            System.out.println(contador+" -->  "+c);
            
            
        }

        System.out.println("<<----ForI------>>");

        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
            
        }
        System.out.println("===============================");

        List<String> verduras = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            verduras.add("verduras"+(i+1));
        }

        for (String v : verduras) {
            System.out.println(v);
            
        
            
        }
        System.out.println("===============================");
        System.out.println("<<--- Cambiar valor a un arreglo --->>");
        verduras.set(0, "Zanahoria");
        verduras.set(1, "Cilantro");
        verduras.set(2, "Cebolla");
        verduras.set(3, "Ajo");
        verduras.set(4, "Jitomate");
        verduras.remove(4);

        Collections.addAll(verduras, "Repollo", "Lechuga", "Coliflor");
        for (int i = 4; i < 8; i++) {
        verduras.remove(i);
            
        }



        for (String v : verduras) {
            System.out.println(v);
            
        }
        Collections.reverse(verduras);
        System.out.println(verduras);

        System.out.println("El más pequeño es: "+Collections.min(verduras));
        System.out.println("El más grande es: "+Collections.max(verduras));
        Collections.sort(verduras);
        System.out.println(verduras);
        System.out.println("La lechuga está en: "+Collections.binarySearch(verduras,"Lechuga"));
        Collections.addAll(verduras, "Lechuga", "Lechuga", "Lechuga");
        System.out.println(verduras);

        Collections.shuffle(verduras);
        System.out.println(verduras);
        System.out.println("Hay: "+Collections.frequency(verduras, "Lechuga")+ " lechugas");


    

       
        

    }
}
