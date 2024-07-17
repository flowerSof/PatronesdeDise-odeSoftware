package Mediator03_AlarmaSeguridad;
public class Alarma extends Sensor {
    public Alarma(InterfaceMediator mediator) {
        super(mediator);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Alarma recibió: " + mensaje);
    }
}
