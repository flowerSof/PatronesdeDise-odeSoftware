package State3;

public class NewMain {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.procesarPedido();
        pedido.enviarPedido(); 
        pedido.entregarPedido();
    }
    
}
