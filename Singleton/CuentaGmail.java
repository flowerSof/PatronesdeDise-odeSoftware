package Singleton;

public class CuentaGmail {
    private static CuentaGmail instancia;
    
    private CuentaGmail(){}
    
    public static CuentaGmail getInstancia(){
        if(instancia==null){
            instancia = new CuentaGmail();
            System.out.println("Su cuenta ha sido creada");
        } else {
            System.out.println("Ya existe una cuenta con ese correo");
        } return instancia;
    }
}
