package Strategy04_Impuestos;
public class Main {
    public static void main(String[] args) {
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();
        
        calculadora.setStrategy(new ImpuestoPeru());
        System.out.println("Impuesto en Perú: " + calculadora.calcularImpuesto(1000));
        
        calculadora.setStrategy(new ImpuestoChile());
        System.out.println("Impuesto en Chile: " + calculadora.calcularImpuesto(1000));

    }
    
}
