package State2;

public class NewMain {

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        for (int i = 0; i < 4; i++) {
            semaforo.mostrar();
            semaforo.cambiarEstado();
        }
    }
    
}
