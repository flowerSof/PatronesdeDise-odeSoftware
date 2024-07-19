package Oberver03_AplicacionesActualizadas;
import java.util.ArrayList;
import java.util.List;
public class Actualizaciones {
    private List<Observer> devices = new ArrayList<>();
    private String latestUpdate;

    public void subscribe(Observer device) {
        devices.add(device);
    }

    public void unsubscribe(Observer device) {
        devices.remove(device);
    }

    public void releaseUpdate(String update) {
        this.latestUpdate = update;
        notifyDevices();
    }

    private void notifyDevices() {
        for (Observer device : devices) {
            device.update(latestUpdate);
        }
    }
}
