package Strategy03_Transporte;
public class ServicioTransporte {
     private EstrategiaTranspote  estrategia;

    public void setEstrategia(EstrategiaTranspote estrategia) {
        this.estrategia = estrategia;
    }

    public void transportar(String origen, String destino) {
        estrategia.transportar(origen, destino);
    }

}
