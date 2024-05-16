package Builder;
public class ComboInfantil extends Pedido{

    @Override
    public void agregarPedido(String item) {
        contenido.add(item);
    }
}
