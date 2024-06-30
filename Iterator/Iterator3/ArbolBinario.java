package Iterator3;
import java.util.Iterator;

class ArbolBinario<T> {
    private Nodo raiz;

    public void agregar(Integer dato) {
        raiz = agregarRecursivo(raiz, dato);
    }

    private Nodo agregarRecursivo(Nodo nodo, Integer dato) {
        if (nodo == null) {
            return new Nodo(dato);
        }

        nodo.izquierdo = agregarRecursivo(nodo.izquierdo, dato);
        return nodo;
    }

    public Iterator<Integer> iterator() {
        return new IteradorEnOrden(raiz);
    }
}

