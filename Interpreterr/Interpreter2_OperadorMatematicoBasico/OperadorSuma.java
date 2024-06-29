package Interpreter2_OperadorMatematicoBasico; 
public class OperadorSuma extends OperadorBinario {
    public OperadorSuma(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    @Override
    public int evalua() {
        return operandoIzquierdo.evalua() + operandoDerecho.evalua();
    }
}
