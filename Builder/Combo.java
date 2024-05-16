package Builder;
public class Combo implements ComboBuilder{
    private Pedido pedido;

    public Combo() {
        this.pedido = new ComboRegular();
    }

    @Override
    public Combo agregarPapas(String tipo) {
        pedido.agregarPedido("Papas " + tipo);
        return this;
    }

    @Override
    public Combo agregarBebida(String sabor) {
        pedido.agregarPedido("" + sabor);
        return this;
    }

    @Override
    public Combo agregarPizza(String tipo) {
        pedido.agregarPedido("Pizza " + tipo);
        return this;
    }

    @Override
    public Combo agregarHamburguesa(String tipo) {
        pedido.agregarPedido("Hamburguesa " + tipo);
        return this;
    }

    @Override
    public Combo build() {
        return this;
    }
    
    public Pedido getPedido(){
        return pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
