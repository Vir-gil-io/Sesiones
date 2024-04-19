//Gilberto Fabian Correa Gonzalez
package mx.utng.s08;

public class Rectangulo {
        private double alto;
        private double ancho;
        public Rectangulo(){
            this.alto=0;
            this.ancho=0;
        }

        public Rectangulo(double medida){
            this.alto=medida;
            this.ancho=medida;
        }

        public Rectangulo(double alto, double ancho){   //Para potencias= (int)Math.pow(x,potencia);
            this.alto= alto;this.ancho= ancho;
        }
        
        public double area(){
            return (double) (alto*ancho);
        }
}
