package Memento3;

public class ConfiguracionAplicacion {
    private String configuracion;

    public void establecerConfiguracion(String configuracion) {
        this.configuracion = configuracion;
    }

    public String obtenerConfiguracion() {
        return configuracion;
    }

    public ConfiguracionMemento guardar() {
        return new ConfiguracionMemento(configuracion);
    }

    public void restaurar(ConfiguracionMemento memento) {
        this.configuracion = memento.getConfiguracion();
    }
}
