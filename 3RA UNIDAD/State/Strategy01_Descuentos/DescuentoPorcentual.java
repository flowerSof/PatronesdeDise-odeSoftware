package Strategy01_Descuentos;
public class DescuentoPorcentual implements EstrategiaDescuento {
    private double porcentaje;

    public DescuentoPorcentual(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - porcentaje / 100);
    }
}

