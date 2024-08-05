package Strategy05_MetodoPago;
public class PagoTarjeta implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con tarjeta.");
    }

}
