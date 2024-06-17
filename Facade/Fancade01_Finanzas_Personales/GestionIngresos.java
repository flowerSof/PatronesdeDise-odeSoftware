package Fancade01_Finanzas_Personales;
import java.util.ArrayList;
import java.util.List;
public class GestionIngresos {
    private ArrayList<Double> ingresos;
    
    public GestionIngresos() {
        this.ingresos = new ArrayList<>();
    }
    
    public void registrarIngreso(String fuente, double cantidad) {
        System.out.println("Ingreso registrado: " + fuente + " - $" + cantidad);
        ingresos.add(cantidad);
    }    
    
    public List<Double> getIngresos() {
        return ingresos;
    }
}
