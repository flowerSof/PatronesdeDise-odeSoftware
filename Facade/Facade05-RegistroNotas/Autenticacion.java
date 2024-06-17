package Facade05;

public class Autenticacion {
    private String usuario = "profesor";
    private String contraseña = "1234";

    public boolean autenticar(String usuario, String contraseña) {
        return usuario.equals(usuario) && contraseña.equals(contraseña);
    }
}
