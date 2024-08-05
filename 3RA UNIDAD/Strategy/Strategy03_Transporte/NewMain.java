package Strategy03_Transporte;
public class NewMain {
    public static void main(String[] args) {
        ServicioTransporte servicio = new ServicioTransporte();

        servicio.setEstrategia(new TransporteAuto());
        servicio.transportar("Lima", "Cusco");

        servicio.setEstrategia(new TransporteAvion());
        servicio.transportar("Lima", "Madrid");

    }
    
}
