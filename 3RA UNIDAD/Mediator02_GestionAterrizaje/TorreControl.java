package Mediator02_GestionAterrizaje;
import java.util.ArrayList;
public class TorreControl implements InterfaceMediator {
    private ArrayList<Avion> aviones;

    public TorreControl() {
        this.aviones = new ArrayList<>();
    }

    public void agregarAvion(Avion avion) {
        this.aviones.add(avion);
    }

    @Override
    public void enviar(String mensaje, Avion emisor) {
        for (Avion avion : aviones) {
            if (avion != emisor) {
                avion.recibir(mensaje);
            }
        }
    }
}
