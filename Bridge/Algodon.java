package Bridge;
public class Algodon implements IElaborar{
    public Algodon() {}
    
    @Override
    public void procesar() {
        System.out.println("\tPrenda elaborada con Algodón");
    }
    
}
