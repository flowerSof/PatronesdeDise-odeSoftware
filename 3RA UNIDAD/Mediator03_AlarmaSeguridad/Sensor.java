package Mediator03_AlarmaSeguridad;
public abstract class Sensor {
    protected InterfaceMediator mediator;

    public Sensor(InterfaceMediator mediator) {
        this.mediator = mediator;
    }

    public void enviar(String mensaje) {
        mediator.enviar(mensaje, this);
    }

    public abstract void recibir(String mensaje);
}
