package Strategy01_Descuentos;
public class Main {
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();

        carrito.setEstrategia(new DescuentoFijo(100));
        System.out.println("Total con descuento fijo: " + carrito.calcularTotal(1000));

        carrito.setEstrategia(new DescuentoPorcentual(10));
        System.out.println("Total con descuento porcentual: " + carrito.calcularTotal(1000));

    }
    
}
