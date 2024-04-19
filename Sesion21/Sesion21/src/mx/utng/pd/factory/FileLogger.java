package mx.utng.pd.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger{
    @Override
    public void log(String msg) {
        try{
        BufferedWriter bw= new BufferedWriter(new FileWriter("log.txt"));
        bw.write(msg);
        bw.close();
        }catch(IOException e){
            System.out.println("Error de entrada y salida"+e.getLocalizedMessage());
            //e.printStackTrace();
        }
    }
}
