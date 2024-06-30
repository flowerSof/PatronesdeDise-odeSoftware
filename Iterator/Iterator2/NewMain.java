package Iterator2;
import java.util.Iterator;

public class NewMain {

    public static void main(String[] args) {
        ArraySimple<String> array = new ArraySimple<>(5);
        array.agregar("A");
        array.agregar("B");
        array.agregar("C");

        Iterator<String> iterador = array.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
    
}
