package State1;

public class Detenido implements EstadoReproductor {
    Reproductor reproductor;

    public Detenido(Reproductor reproductor) {
        this.reproductor = reproductor;
    }

    @Override
    public void play() {
        System.out.println("Iniciando la reproducción");
        reproductor.setEstado(reproductor.getEstadoReproduciendo());
    }

    @Override
    public void pause() {
        System.out.println("El reproductor está detenido, no se puede pausar");
    }

    @Override
    public void stop() {
        System.out.println("El reproductor ya está detenido");
    }
    
}
