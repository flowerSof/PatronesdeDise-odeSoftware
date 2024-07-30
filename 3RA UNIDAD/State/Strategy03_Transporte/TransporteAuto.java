package Strategy03_Transporte;
public class TransporteAuto implements EstrategiaTranspote {
    @Override
    
    public void transportar(String origen, String destino) {
        System.out.println("Transportando en auto de " + origen + " a " + destino);
    }

}
