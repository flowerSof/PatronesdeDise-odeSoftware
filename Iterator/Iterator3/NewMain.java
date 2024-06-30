package Iterator3;

import java.util.Iterator;

public class NewMain {

    public static void main(String[] args) {
        ArbolBinario<Integer> arbol = new ArbolBinario<>();
        arbol.agregar(1);
        arbol.agregar(2);
        arbol.agregar(3);

        Iterator<Integer> iterador = arbol.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
    
}
