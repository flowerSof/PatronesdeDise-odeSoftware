package Iterator2;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteradorArraySimple implements Iterator<String> {
    private String[] array;
    private int índice;
    private int tamaño;

    IteradorArraySimple(String[] array, int tamaño) {
        this.array = array;
        this.tamaño = tamaño;
        this.índice = 0;
    }

    @Override
    public boolean hasNext() {
        return índice < tamaño;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return array[índice++];
    }
}
