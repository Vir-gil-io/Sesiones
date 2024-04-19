/*
 * @Author: Gilberto Fabián Correa González
 * @Date: 16/02/2024
 * @Group: GDS0624
 */
package mx.utng.s17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reto2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\jifac\\OneDrive\\Imágenes\\Escritorio\\Programación Orientada a objetos(TSU)\\Sesion17\\Sesion17\\src\\mx\\utng\\s17\\Reto2.txt");

            //Coloco el objeto que sirve para escribir en el archivo creado
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Poema:\n\n");
            
            bw.write("En la oscuridad me encuentro");//Debe llevar un newLine para salto de línea
            bw.newLine();
            bw.write("Aqui me hice mi hogar");
            bw.newLine();
            bw.write("Y es que aun llevo dentro");
            bw.newLine();
            bw.write("Lo que no deberia pensar");
            bw.newLine();
            bw.newLine();
            bw.write("Si fuera de tu interes saber");
            bw.newLine();
            bw.write("Que el silencio que me esfuerzo por romper");
            bw.newLine();
            bw.write("Al estar contigo mas que con nadie");
            bw.newLine();
            bw.write("Me asfixia y me aisla hasta ya muy tarde");
            bw.newLine();
            bw.write("<------------------------>");
            bw.newLine();
            bw.write("Autor: Gilberto Fabian Correa Gonzalez");
            bw.close();
            //Creo un objeto que permita la lectura de archivo
            FileReader fr = new FileReader("C:\\Users\\jifac\\OneDrive\\Imágenes\\Escritorio\\Programación Orientada a objetos(TSU)\\Sesion17\\Sesion17\\src\\mx\\utng\\s17\\Reto2.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea = null;

            while ((linea = br.readLine())!=null) {
                System.out.println(linea);
            }
    }
}
