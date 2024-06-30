package Iterator1;

import java.util.Iterator;

public class NewMain {

    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        Iterator<Integer> iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
    
}
