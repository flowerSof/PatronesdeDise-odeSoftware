package Interpreter2_OperadorMatematicoBasico;
public class Numero extends Expresion{
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public int evalua() {
        return valor;
    }
}
