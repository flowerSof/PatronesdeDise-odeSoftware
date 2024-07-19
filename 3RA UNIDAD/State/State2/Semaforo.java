package State2;

public class Semaforo {
    EstadoSemaforo estadoRojo;
    EstadoSemaforo estadoAmarillo;
    EstadoSemaforo estadoVerde;

    EstadoSemaforo estadoActual;

    public Semaforo() {
        estadoRojo = new SemaforoRojo();
        estadoAmarillo = new SemaforoAmarillo();
        estadoVerde = new SemaforoVerde();

        estadoActual = estadoRojo;
    }

    public void setEstado(EstadoSemaforo estado) {
        this.estadoActual = estado;
    }

    public void mostrar() {
        estadoActual.mostrar();
    }

    public void cambiarEstado() {
        if (estadoActual instanceof SemaforoRojo) {
            setEstado(estadoAmarillo);
        } else if (estadoActual instanceof SemaforoAmarillo) {
            setEstado(estadoVerde);
        } else if (estadoActual instanceof SemaforoVerde) {
            setEstado(estadoRojo);
        }
    }
}
