package Proxy06;

public class ProxyProteccion implements Documento {
    private DocumentoReal documentoReal;
    private boolean esAdmin;

    public ProxyProteccion(boolean esAdmin) {
        this.documentoReal = new DocumentoReal();
        this.esAdmin = esAdmin;
    }

    @Override
    public void leer() {
        documentoReal.leer();
    }

    @Override
    public void escribir(String contenido) {
        if (esAdmin) {
            documentoReal.escribir(contenido);
        } else {
            System.out.println("Acceso denegado: no tiene permisos de escritura.");
        }
    }
}
