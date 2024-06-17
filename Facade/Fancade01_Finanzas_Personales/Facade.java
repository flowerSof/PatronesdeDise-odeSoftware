package Fancade01_Finanzas_Personales;

import java.util.ArrayList;

public class Facade {
    private GestionGastos gestiongastos;
    private GestionIngresos gestioningresos;
    private ReporteGastos reportesgastos;

    public Facade() {
        this.gestiongastos = new GestionGastos();
        this.gestioningresos = new GestionIngresos();
        this.reportesgastos = new ReporteGastos();
    }
    
    public void registrarIngreso(String fuente, double cantidad) {
        gestioningresos.registrarIngreso(fuente, cantidad);
    }

    public void registrarGasto(String categoria, double cantidad) {
        gestiongastos.registrarGasto(categoria, cantidad);
    }

    public void generarReporteMensual() {   
        reportesgastos.generarReporteMensual((ArrayList<Double>) gestioningresos.getIngresos(), gestiongastos.getGastos());
    }
}
