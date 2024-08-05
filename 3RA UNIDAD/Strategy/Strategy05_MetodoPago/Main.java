package Strategy05_MetodoPago;
public class Main {
    public static void main(String[] args) {
        CarritoCompra carrito = new CarritoCompra();
        
        carrito.setMetodoPago(new PagoTarjeta());
        carrito.realizarPago(1000);
        
        carrito.setMetodoPago(new PagoPaypal());
        carrito.realizarPago(2000);

    }
    
}
