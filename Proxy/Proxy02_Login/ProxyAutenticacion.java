package Proxy02_Login;
public class ProxyAutenticacion implements Servicio {
    private Serviciaso servicioReal;
    private String usuario;
    private String password;

    public ProxyAutenticacion(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
        this.servicioReal = new Serviciaso();
    }

    public void operacion() {
        if (autenticar()) {
            servicioReal.operacion();
        } else {
            System.out.println("Autenticación fallida: acceso denegado");
        }
    }

    private boolean autenticar() {
        // Lógica de autenticación simplificada (en un caso real, esto sería más complejo)
        return "admin".equals(usuario) && "admin123".equals(password);
    }
}
