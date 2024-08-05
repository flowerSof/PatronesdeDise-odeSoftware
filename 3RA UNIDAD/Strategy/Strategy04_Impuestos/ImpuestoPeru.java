package Strategy04_Impuestos;
public class ImpuestoPeru implements EstrategiaImpuesto {
    @Override
    public double calcular(double monto) {
        return monto * 0.18;
    }
}
