package ADAPTER;
public class DocumentoHTML implements Documento{
    protected ComponenteHTML herramientaHTML = new ComponenteHTML();
    
    @Override
    public void setContenido(String contenido) {
        herramientaHTML.FijaContenido(contenido);
    }

    @Override
    public void escribir() {
        
    }

    @Override
    public void imprime() {
        herramientaHTML.EnviaImpresora();
    }
    
}
