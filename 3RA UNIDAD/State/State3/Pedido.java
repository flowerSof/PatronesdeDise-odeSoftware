package State3;

public class Pedido {
    EstadoPedido estadoNuevo;
    EstadoPedido estadoProcesando;
    EstadoPedido estadoEnviado;
    EstadoPedido estadoEntregado;

    EstadoPedido estadoActual;

    public Pedido() {
        estadoNuevo = new PedidoNuevo(this);
        estadoProcesando = new PedidoProcesando(this);
        estadoEnviado = new PedidoEnviado(this);
        estadoEntregado = new PedidoEntregado(this);

        estadoActual = estadoNuevo;
    }

    public void setEstado(EstadoPedido estado) {
        this.estadoActual = estado;
    }

    public void procesarPedido() {
        estadoActual.procesarPedido();
    }

    public void enviarPedido() {
        estadoActual.enviarPedido();
    }

    public void entregarPedido() {
        estadoActual.entregarPedido();
    }

    public EstadoPedido getEstadoNuevo() {
        return estadoNuevo;
    }

    public EstadoPedido getEstadoProcesando() {
        return estadoProcesando;
    }

    public EstadoPedido getEstadoEnviado() {
        return estadoEnviado;
    }

    public EstadoPedido getEstadoEntregado() {
        return estadoEntregado;
    }
}
