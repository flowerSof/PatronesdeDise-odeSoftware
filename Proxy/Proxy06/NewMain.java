package Proxy06;

public class NewMain {

    public static void main(String[] args) {
        Documento documentoAdmin = new ProxyProteccion(true);
        Documento documentoUsuario = new ProxyProteccion(false);

        documentoAdmin.leer();
        documentoAdmin.escribir("Contenido nuevo");

        documentoUsuario.leer();
        documentoUsuario.escribir("Intentando escribir");
    }
    
}
