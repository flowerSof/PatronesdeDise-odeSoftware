package Strategy05_MetodoPago;
public class CarritoCompra {
    private MetodoPago metodoPago;

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago(double monto) {
        metodoPago.pagar(monto);
    }

}
