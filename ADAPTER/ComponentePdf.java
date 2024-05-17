package ADAPTER;
public class ComponentePdf implements Componente{
    protected String contenido;
    
    @Override
    public void FijaContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void EnviaImpresora() {
        System.out.println("Impresión PDF: " + contenido);
    }
    
}
