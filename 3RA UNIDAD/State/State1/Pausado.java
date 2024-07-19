package State1;

public class Pausado implements EstadoReproductor {
    Reproductor reproductor;

    public Pausado(Reproductor reproductor) {
        this.reproductor = reproductor;
    }

    @Override
    public void play() {
        System.out.println("Reanudando la reproducción");
        reproductor.setEstado(reproductor.getEstadoReproduciendo());
    }

    @Override
    public void pause() {
        System.out.println("El reproductor ya está pausado");
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo la reproducción");
        reproductor.setEstado(reproductor.getEstadoDetenido());
    }
}
