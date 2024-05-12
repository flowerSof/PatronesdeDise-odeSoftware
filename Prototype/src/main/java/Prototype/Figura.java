package Prototype;

public abstract class Figura implements Cloneable{
    protected String color;
    protected int x;
    protected int y;

    public Figura(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void dibujar();
    public abstract void posicion();
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Figura clon = (Figura) super.clone();
        return clon;
    }
}
