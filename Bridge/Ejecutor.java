package Bridge;
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo camisa algodon
        ElaborarRopa camisa = new ElaborarCamisa(new Algodon());
        camisa.fabricar();

        // Ahora le indicamos que use otra implementación para que sea de lana
        camisa.setImplementador(new Lana());
        camisa.fabricar();

        // Crear un objeto de tipo pantalon de algodon
        ElaborarRopa pantalon = new ElaborarPantalon(new Algodon());
        pantalon.fabricar();

        // Ahora le indicamos que use otra implementación para que sea de lana
        pantalon.setImplementador(new Lana());
        pantalon.fabricar();
    }
    
}
