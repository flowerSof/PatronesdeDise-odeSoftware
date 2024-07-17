package Memento3;

public class NewMain {
    public static void main(String[] args) {
        ConfiguracionAplicacion appConfig = new ConfiguracionAplicacion();
        appConfig.establecerConfiguracion("Configuración Inicial");
        
        ConfiguracionMemento memento = appConfig.guardar();
        
        appConfig.establecerConfiguracion("Configuración Modificada");
        System.out.println("Configuración actual: " + appConfig.obtenerConfiguracion());
        
        appConfig.restaurar(memento);
        System.out.println("Configuración restaurada: " + appConfig.obtenerConfiguracion());
    }
    
}
