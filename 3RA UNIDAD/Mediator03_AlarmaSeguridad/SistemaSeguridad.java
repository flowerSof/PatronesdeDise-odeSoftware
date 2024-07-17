package Mediator03_AlarmaSeguridad;
import java.util.ArrayList;
public class SistemaSeguridad implements InterfaceMediator {
    private ArrayList<Sensor> sensores;

    public SistemaSeguridad() {
        this.sensores = new ArrayList<>();
    }

    public void agregarSensor(Sensor sensor) {
        this.sensores.add(sensor);
    }

    @Override
    public void enviar(String mensaje, Sensor emisor) {
        for (Sensor sensor : sensores) {
            if (sensor != emisor) {
                sensor.recibir(mensaje);
            }
        }
    }
}
