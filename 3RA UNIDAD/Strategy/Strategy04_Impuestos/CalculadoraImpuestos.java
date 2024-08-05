package Strategy04_Impuestos;
public class CalculadoraImpuestos {
    private  EstrategiaImpuesto strategy;

    public void setStrategy(EstrategiaImpuesto strategy) {
        this.strategy = strategy;
    }

    public double calcularImpuesto(double monto) {
        return strategy.calcular(monto);
    }

}
