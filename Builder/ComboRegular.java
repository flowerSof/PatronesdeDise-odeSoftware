package Builder;
public class ComboRegular extends Pedido{

    @Override
    public void agregarPedido(String item) {
        contenido.add(item);
    }
    
}
