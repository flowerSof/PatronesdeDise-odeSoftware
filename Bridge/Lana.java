package Bridge;
public class Lana implements IElaborar{
    public Lana() {}
    
    @Override
    public void procesar() {
        System.out.println("\tPrenda elaborada con Lana");
    }
    
}
