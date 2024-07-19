package Mediator02_GestionAterrizaje;
public abstract class Avion {
    protected InterfaceMediator mediator;

    public Avion(InterfaceMediator mediator) {
        this.mediator = mediator;
    }

    public void enviar(String mensaje) {
        mediator.enviar(mensaje, this);
    }

    public abstract void recibir(String mensaje);
}
