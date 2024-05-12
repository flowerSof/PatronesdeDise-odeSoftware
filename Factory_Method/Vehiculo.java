package Factory_Method;
public abstract class Vehiculo {
    protected String modelo;
    protected double precio;
    protected String color;
    
    public Vehiculo(String modelo, double precio, String color) {
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
    }
    
    public abstract void InfoProducto();
}
