package Proxy01_ProteccionDocumento;
public class InformeVentas implements Documento {
    private String contenido;

    public InformeVentas(String contenido) {
        this.contenido = contenido;
    }

    public void mostrarContenido() {
        System.out.println(contenido);
    }
}