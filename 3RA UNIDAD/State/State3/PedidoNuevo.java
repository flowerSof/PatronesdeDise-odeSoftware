package State3;

public class PedidoNuevo implements EstadoPedido {
    Pedido pedido;

    public PedidoNuevo(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void procesarPedido() {
        System.out.println("El pedido es nuevo. Procesando el pedido...");
        pedido.setEstado(pedido.getEstadoProcesando());
    }

    @Override
    public void enviarPedido() {
        System.out.println("El pedido aún no está procesado, no se puede enviar.");
    }

    @Override
    public void entregarPedido() {
        System.out.println("El pedido aún no está enviado, no se puede entregar.");
    }
}
