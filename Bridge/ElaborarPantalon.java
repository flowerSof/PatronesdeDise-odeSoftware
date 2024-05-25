package Bridge;
public class ElaborarPantalon extends ElaborarRopa{
    
    public ElaborarPantalon(IElaborar implementador) {
        this.setImplementador(implementador);
    }
    
    @Override
    public void fabricar() {
        System.out.println("Fabricando un pantalón...");
        this.getImplementador().procesar();
    }
    
}
