package State2;

public class SemaforoVerde implements EstadoSemaforo {
    @Override
    public void mostrar() {
        System.out.println("Verde: Avanzar");
    }
}
