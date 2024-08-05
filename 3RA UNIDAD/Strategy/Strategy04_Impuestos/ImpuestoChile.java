package Strategy04_Impuestos;
public class ImpuestoChile implements EstrategiaImpuesto{
    @Override
    public double calcular(double monto) {
        return monto * 0.19;
    }

}
