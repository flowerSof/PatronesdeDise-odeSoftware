package Factory_Method;
public class FabricarAuto extends FabricarVehiculos{

    @Override
    public Vehiculo crearVehiculo(String modelo, double precio, String color) {
        System.out.println("Se fabrico un vehiculo Auto");
        return new Auto(modelo, precio, color);
    }

}
