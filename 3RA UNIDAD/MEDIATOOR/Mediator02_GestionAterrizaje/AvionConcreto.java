package Mediator02_GestionAterrizaje;
public class AvionConcreto extends Avion {
    public AvionConcreto(InterfaceMediator mediator) {
        super(mediator);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("AvionConcreto1 recibió: " + mensaje);
    }
}
