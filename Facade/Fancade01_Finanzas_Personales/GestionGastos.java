package Fancade01_Finanzas_Personales;
import java.util.ArrayList;
public class GestionGastos {
    private ArrayList<Double> gastos;
    
    public GestionGastos() {
        this.gastos = new ArrayList<>();
    }
    
    public void registrarGasto(String categoria, double cantidad) {
        System.out.println("Gasto registrado: " + categoria + " - $" + cantidad);
        gastos.add(cantidad);
    }
    
    public ArrayList<Double> getGastos() {
        return gastos;
    }
}
