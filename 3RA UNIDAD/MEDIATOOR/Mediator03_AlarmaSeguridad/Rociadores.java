package Mediator03_AlarmaSeguridad;
public class Rociadores extends Sensor {
    public Rociadores(InterfaceMediator mediator) {
        super(mediator);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Rociador recibió: " + mensaje);
    }
}
