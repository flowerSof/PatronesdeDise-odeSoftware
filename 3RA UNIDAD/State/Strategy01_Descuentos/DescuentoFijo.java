package Strategy01_Descuentos;
public class DescuentoFijo implements EstrategiaDescuento {
    private double descuento;

    public DescuentoFijo(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto - descuento;
    }
}

