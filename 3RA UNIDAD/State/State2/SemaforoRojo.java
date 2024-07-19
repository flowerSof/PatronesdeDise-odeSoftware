package State2;

public class SemaforoRojo implements EstadoSemaforo {
    @Override
    public void mostrar() {
        System.out.println("Rojo: Detenerse");
    }
    
}
