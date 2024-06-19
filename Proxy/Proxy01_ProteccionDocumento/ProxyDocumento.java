package Proxy01_ProteccionDocumento;
public class ProxyDocumento implements Documento {
    private InformeVentas documentoReal;
    private String usuario;

    public ProxyDocumento(String contenido, String usuario) {
        this.documentoReal = new InformeVentas(contenido);
        this.usuario = usuario;
    }

    public void mostrarContenido() {
        if (esUsuarioAutorizado()) {
            documentoReal.mostrarContenido();
        } else {
            System.out.println("Acceso denegado");
        }
    }

    private boolean esUsuarioAutorizado() {
        // Lógica de autorización basada en el usuario
        return "admin".equals(usuario);
    }
}
