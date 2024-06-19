package Proxy01_ProteccionDocumento;
public class Main {
    public static void main(String[] args) {
        Documento documento = new ProxyDocumento("Contenido Secreto", "user");
        documento.mostrarContenido();
        
        Documento documentoAdmin = new ProxyDocumento("Contenido Secreto", "admin");
        documentoAdmin.mostrarContenido();
    }
    
}
