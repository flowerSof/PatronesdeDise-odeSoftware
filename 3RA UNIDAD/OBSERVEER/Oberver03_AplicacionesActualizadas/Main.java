package Oberver03_AplicacionesActualizadas;
public class Main {
    public static void main(String[] args) {
        Actualizaciones updateServer = new Actualizaciones();

        Observer device1 = new Dispositivo("celualar Android");
        Observer device2 = new Dispositivo("Iphone");

        updateServer.subscribe(device1);
        updateServer.subscribe(device2);

        updateServer.releaseUpdate("Version 1.1");

        updateServer.unsubscribe(device1);

        updateServer.releaseUpdate("Version 1.2");
    }
    
}
