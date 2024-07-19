package State3;

public class PedidoEntregado implements EstadoPedido {
    Pedido pedido;

    public PedidoEntregado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void procesarPedido() {
        System.out.println("El pedido ya ha sido procesado.");
    }

    @Override
    public void enviarPedido() {
        System.out.println("El pedido ya ha sido enviado.");
    }

    @Override
    public void entregarPedido() {
        System.out.println("El pedido ya ha sido entregado al cliente.");
    }
}
