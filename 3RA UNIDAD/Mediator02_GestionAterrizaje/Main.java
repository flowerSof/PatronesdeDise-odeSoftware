package Mediator02_GestionAterrizaje;
public class Main {
    public static void main(String[] args) {
        TorreControl torreControl = new TorreControl();

        Avion avion1 = new AvionConcreto(torreControl);
        Avion avion2 = new AvionConcreto(torreControl);

        torreControl.agregarAvion(avion1);
        torreControl.agregarAvion(avion2);

        avion1.enviar("Solicitando permiso para aterrizar.");
    }
    
}
