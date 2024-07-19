package State3;

public class PedidoProcesando implements EstadoPedido {
    Pedido pedido;

    public PedidoProcesando(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void procesarPedido() {
        System.out.println("El pedido ya está en proceso.");
    }

    @Override
    public void enviarPedido() {
        System.out.println("El pedido está siendo procesado. Preparando para enviar...");
        pedido.setEstado(pedido.getEstadoEnviado());
    }

    @Override
    public void entregarPedido() {
        System.out.println("El pedido aún no está enviado, no se puede entregar.");
    }
}
