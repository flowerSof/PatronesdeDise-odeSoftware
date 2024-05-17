package ADAPTER;
public class Documentotxt implements Documento{
    
    protected String contenido;
    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;     
    }

    @Override
    public void escribir() {
    System.out.println("Dibuja el documento txt: " +  contenido); 
    }

    @Override
    public void imprime() {
        System.out.println("Imprime el documento txt: " +  contenido);
    }
    
}
