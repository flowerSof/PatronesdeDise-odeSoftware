package Factory_Method;
public class CLIENTE {
    public static void main(String[] args) {
        FabricarVehiculos fabricaAutos = new FabricarAuto();
        Vehiculo auto1 = fabricaAutos.crearVehiculo("Audi A4 Allroad Quattro", 22490172,"plomo");
        auto1.InfoProducto();

        FabricarVehiculos fabricaMotos = new FabricarMoto();
        Vehiculo moto1 = fabricaMotos.crearVehiculo("B52 Motox 200", 5590, "regro");
        moto1.InfoProducto();
    }
    
}
