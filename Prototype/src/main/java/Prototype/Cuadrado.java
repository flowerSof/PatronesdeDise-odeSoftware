package Prototype;

public class Cuadrado extends Figura{
    private int lado;

    public Cuadrado(String color, int x, int y, int lado) {
        super(color, x, y);
        this.lado = lado;
    }
    
    @Override
    public void dibujar() {
       System.out.println("Dibujando cuadrado con color: " + color+ ", de lado: "+lado);
    }
    
    @Override
    public void posicion(){
        System.out.println("En la posicion: " + "("+x+","+y+")");
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Cuadrado cuadradoclon = (Cuadrado) super.clone();
        cuadradoclon.lado = lado;
        return cuadradoclon;
    }
}
