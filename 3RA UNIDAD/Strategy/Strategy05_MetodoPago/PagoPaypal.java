package Strategy05_MetodoPago;
public class PagoPaypal implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con PayPal.");
    }
}
