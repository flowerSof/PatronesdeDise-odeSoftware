package Iterator1;
import java.util.Iterator;

class ListaSimple<T> {
    private Nodo cabeza;

    public void agregar(Integer dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public Iterator<Integer> iterator() {
        return new IteradorListaSimple(cabeza);
    }
}
