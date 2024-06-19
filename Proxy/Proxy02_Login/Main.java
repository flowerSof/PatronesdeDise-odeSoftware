package Proxy02_Login;
public class Main {
    public static void main(String[] args) {
        Servicio servicio1 = new ServicioProxy("admin", "admin123");
        servicio1.operacion(); // Autenticación exitosa y operación permitida

        Servicio servicio2 = new ServicioProxy("user", "wrongpassword");
        servicio2.operacion(); // Autenticación fallida y acceso denegado
    }
    
}
