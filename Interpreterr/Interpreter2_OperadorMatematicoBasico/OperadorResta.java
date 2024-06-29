package Interpreter2_OperadorMatematicoBasico;
public class OperadorResta extends OperadorBinario {
    public OperadorResta(Expresion operandoIzquierdo, Expresion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    @Override
    public int evalua() {
        return operandoIzquierdo.evalua() - operandoDerecho.evalua();
    }
}
