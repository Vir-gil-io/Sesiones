package mx.utng.s17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binario {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        //Declaramos instancia de BufferedInputStream
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("src/mx/utng/s17/Logo-cbtis75(2).png"));
        //Declaramos una instancia de BufferedOutputStream
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("src/mx/utng/s17/Logo-cbtis75(2)_copia.png"));
        //Definimos el buffer de escritura de datos 
        byte[] buffer= new byte[1024];
        //Iniciar la copia del archivo
        int bytesLeidos=0;
        while ((bytesLeidos=bis.read(buffer))>0) {
            bos.write(buffer, 0, bytesLeidos);//Buffer, inicio y el byte que está escribiendo
        }
        bos.close();
        bis.close();
    }
}
