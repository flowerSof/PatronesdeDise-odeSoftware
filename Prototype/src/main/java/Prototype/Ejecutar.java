
package Prototype;

public class Ejecutar {

    public static void main(String[] args) {
        Figura circuloPrototipo = new Circulo("rojo", 10, 20, 30);
        Figura cuadradoPrototipo = new Cuadrado("azul", 50, 40, 50);
        Figura rectanguloPrototipo = new Rectangulo("verde", 80, 60, 70, 40);
        
        try{
        Figura circulo1 = (Figura) circuloPrototipo.clone();
        Figura circulo2 = (Figura) circuloPrototipo.clone();
        circulo2.setColor("blanco");
        Figura cuadrado1 = (Figura) cuadradoPrototipo.clone();
        Figura cuadrado2 = (Figura) cuadradoPrototipo.clone();
        cuadrado2.setColor("naranja");
        Figura rectangulo1 = (Figura) rectanguloPrototipo.clone();
        Figura rectangulo2 = (Figura) rectanguloPrototipo.clone();
        rectangulo2.setColor("morado");
        
        circulo1.dibujar();
        circulo1.posicion();
        circulo2.dibujar();
        
        cuadrado1.dibujar();
        cuadrado1.posicion();
        cuadrado2.dibujar();
        
        rectangulo1.dibujar();
        rectangulo1.posicion();
        rectangulo2.dibujar();
        
        }catch (CloneNotSupportedException exception){
            System.out.println("Error al dibujar las figuras");   
        }
    } 
}
