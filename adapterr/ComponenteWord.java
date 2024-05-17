package adapterr;
public class ComponenteWord implements Componente{
    protected String contenido;
    
    @Override
    public void FijaContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void EnviaImpresora() {
        System.out.println("Impresión WORD: " + contenido);
    }

}
