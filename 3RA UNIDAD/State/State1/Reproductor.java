package State1;

public class Reproductor {
    EstadoReproductor estadoReproduciendo;
    EstadoReproductor estadoPausado;
    EstadoReproductor estadoDetenido;

    EstadoReproductor estadoActual;

    public Reproductor() {
        estadoReproduciendo = new Reproduciendo(this);
        estadoPausado = new Pausado(this);
        estadoDetenido = new Detenido(this);

        estadoActual = estadoDetenido;
    }

    public void setEstado(EstadoReproductor estado) {
        this.estadoActual = estado;
    }

    public void play() {
        estadoActual.play();
    }

    public void pause() {
        estadoActual.pause();
    }

    public void stop() {
        estadoActual.stop();
    }

    public EstadoReproductor getEstadoReproduciendo() {
        return estadoReproduciendo;
    }

    public EstadoReproductor getEstadoPausado() {
        return estadoPausado;
    }

    public EstadoReproductor getEstadoDetenido() {
        return estadoDetenido;
    }
}
