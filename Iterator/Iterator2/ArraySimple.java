package Iterator2;
import java.util.Iterator;

class ArraySimple<T> {
    private String[] array;
    private int tamaño;

    public ArraySimple(int capacidad) {
        array = new String[capacidad];
        tamaño = 0;
    }

    public void agregar(String dato) {
        if (tamaño < array.length) {
            array[tamaño++] = dato;
        }
    }

    public Iterator<String> iterator() {
        return new IteradorArraySimple(array, tamaño);
    }
}
