package Oberver03_AplicacionesActualizadas;
public class Dispositivo implements Observer {
    private String deviceName;

    public Dispositivo(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void update(String update) {
        System.out.println(deviceName + " Revisa actualizaciones: " + update);
    }
}
