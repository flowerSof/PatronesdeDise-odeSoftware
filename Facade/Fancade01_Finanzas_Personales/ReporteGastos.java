package Fancade01_Finanzas_Personales;

import java.util.ArrayList;

public class ReporteGastos {
    public void generarReporteMensual(ArrayList<Double> ingresos, ArrayList<Double> gastos) {
        System.out.println("---- Reporte Mensual ----");
        System.out.println("Ingresos:");
        for (Double ingreso : ingresos) {
            System.out.println("$" + ingreso);
        }
        System.out.println("Gastos:");
        for (Double gasto : gastos) {
            System.out.println("$" + gasto);
        }
        System.out.println("-------------------------");
    }
}
