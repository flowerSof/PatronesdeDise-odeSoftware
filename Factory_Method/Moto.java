package Factory_Method;
public class Moto extends Vehiculo{
    
    public Moto(String modelo, double precio, String color) {
        super(modelo, precio, color);
    }

    @Override
    public void InfoProducto() {
        System.out.println("Modelo: " + modelo + ", Precio: " + precio + ", Color: " + color);
    }
    
}
