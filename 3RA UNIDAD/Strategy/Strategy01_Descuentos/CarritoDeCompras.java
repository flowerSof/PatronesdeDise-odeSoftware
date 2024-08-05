package Strategy01_Descuentos;
public class CarritoDeCompras {
    private EstrategiaDescuento estrategia;

    public void setEstrategia(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularTotal(double monto) {
        return estrategia.aplicarDescuento(monto);
    }
}
