package Fancade01_Finanzas_Personales;
public class Main {
    public static void main(String[] args) {
        Facade finanzas = new Facade();

        finanzas.registrarIngreso("Salario", 3000.00);
        finanzas.registrarGasto("Alquiler", 1000.00);
        finanzas.generarReporteMensual();
    }
    
}
