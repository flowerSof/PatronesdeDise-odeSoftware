package Proxy06;

public class DocumentoReal implements Documento {
    private String contenido;

    @Override
    public void leer() {
        System.out.println("Contenido del documento: " + contenido);
    }

    @Override
    public void escribir(String contenido) {
        this.contenido = contenido;
        System.out.println("Escribiendo en el documento: " + contenido);
    }
}
