package Prototype;

public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo(String color, int x, int y, int base, int altura){
        super(color, x, y);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void dibujar() {
       System.out.println("Dibujando rectangulo con color: " + color+ ", de base: "
               +base+ ", y altura: "+altura);
    }
    
    @Override
    public void posicion(){
        System.out.println("En la posicion: " + "("+x+","+y+")");
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Rectangulo rectanguloclon = (Rectangulo) super.clone();
        rectanguloclon.base = base;
        rectanguloclon.altura = altura;
        return rectanguloclon;
    }
}
