package adapterr;
public class DocumentoWord implements Documento{
    protected ComponenteWord herramientaWord = new ComponenteWord();
    @Override
    public void setContenido(String contenido) {
        herramientaWord.FijaContenido(contenido);
    }

    @Override
    public void escribir() {
        
    }

    @Override
    public void imprime() {
        herramientaWord.EnviaImpresora();
    }
    
}
