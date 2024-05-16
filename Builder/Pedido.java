package Builder;
import java.util.*;
public abstract class Pedido {
    protected List<String> contenido = new ArrayList<>();
    
    protected Pedido() {}

    public abstract void agregarPedido(String item);
    
    public void mostrar() {
        System.out.println("Combo: " + String.join(", ", contenido));
    }
    
}
