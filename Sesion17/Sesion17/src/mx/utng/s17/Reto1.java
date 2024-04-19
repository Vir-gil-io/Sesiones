package mx.utng.s17;

import java.io.File;

public class Reto1{
public static void main(String[] args) {
    File direcotrioInicial=new File("C:\\Users\\jifac\\OneDrive\\Imágenes\\Escritorio\\Programación Orientada a objetos(TSU)\\Sesion17\\Sesion17\\temp");
    muestraContenidoDirectorio(direcotrioInicial);
}
    private static void muestraContenidoDirectorio(File directorio){
        //Pner la marca de inicio
        colocaEspacios(directorio.getParent(), 'D');

        //Crear un arreglo de subdirectorios
        File[] subdirectorios= directorio.listFiles();
        //Recorrer la lista de archivos y verificamos que sean directorios o archivos (A) o (D)
        for (File archivo : subdirectorios) {
            //Verificar si es archivo
            if(archivo.isFile()){
                colocaEspacios(archivo.getParent(), 'A');
                System.out.println(archivo.getName());
            }else if(archivo.isDirectory()){
                muestraContenidoDirectorio(archivo);
            }
        }

    }
    private static void colocaEspacios(String padre, char simbolo){
        //Colocar la marca de inicio de linea [A]- Archivo [D]- Directorio   
        System.out.print("["+simbolo+"]");
        //Colocar serie de giones de acuerdo a la profundidad del directorio
        for (int i = 0; i < padre.length(); i++) {
            System.out.print('-');
        }

     }
}