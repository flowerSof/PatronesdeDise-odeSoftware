package Iterator1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteradorListaSimple implements Iterator<Integer>{
    private Nodo actual;

    IteradorListaSimple(Nodo cabeza) {
        this.actual = cabeza;
    }

    @Override
    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Integer dato = actual.dato;
        actual = actual.siguiente;
        return dato;
    }
}
