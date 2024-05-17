package adapterr;
public class DocumentoPdf implements Documento{
    protected ComponentePdf herramientaPdf = new ComponentePdf();

    @Override
    public void setContenido(String contenido) {
        herramientaPdf.FijaContenido(contenido);
    }

    @Override
    public void escribir() {
        
    }

    @Override
    public void imprime() {
        herramientaPdf.EnviaImpresora();
    }
    
}
