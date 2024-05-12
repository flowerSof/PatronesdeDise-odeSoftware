package Factory_Method;
public class FabricarMoto extends FabricarVehiculos{

    @Override
    public Vehiculo crearVehiculo(String modelo, double precio, String color) {
        System.out.println("Se fabrico un vehiculo Moto");
        return new Moto(modelo, precio, color);
    }
    
}
