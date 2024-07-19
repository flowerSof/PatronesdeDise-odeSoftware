package State3;

public class PedidoEnviado implements EstadoPedido {
    Pedido pedido;

    public PedidoEnviado(Pedido pedido) {
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
        System.out.println("El pedido ha sido enviado. En camino al cliente...");
        pedido.setEstado(pedido.getEstadoEntregado());
    }
}
