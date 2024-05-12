package Prototype;

public class Circulo extends Figura{
    private int radio;

    public Circulo(String color, int x, int y, int radio) {
        super(color,x ,y);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
       System.out.println("Dibujando círculo con color: " + color+ ", de radio: "+radio);
    }
    
    @Override
    public void posicion(){
        System.out.println("En la posicion: " + "("+x+","+y+")");
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Circulo circuloclon = (Circulo) super.clone();
        circuloclon.radio = radio;
        return circuloclon;
    }
}
