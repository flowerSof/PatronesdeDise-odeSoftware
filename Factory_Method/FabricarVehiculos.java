package Factory_Method;
public abstract class FabricarVehiculos {
    public abstract Vehiculo crearVehiculo(String modelo, double precio, String color);
}
