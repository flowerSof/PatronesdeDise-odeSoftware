package ADAPTER;
public class ComponenteHTML implements Componente{
    protected String contenido;
    
    @Override
    public void FijaContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void EnviaImpresora() {
        System.out.println("Impresión HTML: " + contenido);
    }
    
    
}
