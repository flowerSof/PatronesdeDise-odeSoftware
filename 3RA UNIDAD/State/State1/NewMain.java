package State1;

public class NewMain {

    public static void main(String[] args) {
        Reproductor reproductor = new Reproductor();

        reproductor.play();
        reproductor.pause();
        reproductor.play();
        reproductor.stop();
        reproductor.pause();
    }
    
}
