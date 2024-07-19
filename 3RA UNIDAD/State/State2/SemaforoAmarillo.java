package State2;

public class SemaforoAmarillo implements EstadoSemaforo {
    @Override
    public void mostrar() {
        System.out.println("Amarillo: Precaución");
    }
}
