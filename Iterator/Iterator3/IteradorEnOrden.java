package Iterator3;
import java.util.Iterator;
import java.util.Stack;

public class IteradorEnOrden implements Iterator<Integer> {
    private Stack<Nodo> pila = new Stack<>();
    private Nodo actual;

    IteradorEnOrden(Nodo raiz) {
        this.actual = raiz;
    }

    @Override
    public boolean hasNext() {
        return !pila.isEmpty() || actual != null;
    }

    @Override
    public Integer next() {
        while (actual != null) {
            pila.push(actual);
            actual = actual.izquierdo;
        }
        Nodo nodo = pila.pop();
        Integer resultado = nodo.dato;
        actual = nodo.derecho;
        return resultado;
    }
}

