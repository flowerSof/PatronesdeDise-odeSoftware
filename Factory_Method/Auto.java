package Factory_Method;
public class Auto extends Vehiculo{
    private int numeroPuertas;
    
    public Auto(String modelo, double precio, String color) {
        super(modelo, precio, color);
    }
    
    public Auto(String modelo, double precio, String color, int numeroPuertas) {
        super(modelo, precio, color);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void InfoProducto() {
        System.out.println("Modelo: " + modelo + ", Precio: " + precio + ", Puertas: " + numeroPuertas + ", Color: " + color);
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
}
