package State1;

public class Reproduciendo implements EstadoReproductor {
    Reproductor reproductor;

    public Reproduciendo(Reproductor reproductor) {
        this.reproductor = reproductor;
    }

    @Override
    public void play() {
        System.out.println("El reproductor ya está reproduciendo");
    }

    @Override
    public void pause() {
        System.out.println("Pausando la reproducción");
        reproductor.setEstado(reproductor.getEstadoPausado());
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo la reproducción");
        reproductor.setEstado(reproductor.getEstadoDetenido());
    }
    
}
