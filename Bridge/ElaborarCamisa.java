package Bridge;
public class ElaborarCamisa extends ElaborarRopa{
    
    public ElaborarCamisa(IElaborar implementador) {
        this.setImplementador(implementador);
    }
    
    @Override
    public void fabricar() {
        System.out.println("Fabricando una camisa...");
        this.getImplementador().procesar();
    }
    
}
