package Strategy03_Transporte;
public class TransporteAvion implements EstrategiaTranspote {
    @Override
    public void transportar(String origen, String destino) {
        System.out.println("Transportando en avión de " + origen + " a " + destino);
    }

}
