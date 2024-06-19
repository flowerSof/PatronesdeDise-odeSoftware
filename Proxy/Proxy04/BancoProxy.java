package Proxy04;

public class BancoProxy implements Banco{
    private ServicioBanco servicioBanco;
    boolean autenticado;

    public BancoProxy(String usuario, String contraseña) {
        if (autenticar(usuario, contraseña)) {
            servicioBanco = new ServicioBanco();
            autenticado = true;
        }
    }

    private boolean autenticar(String usuario, String contraseña) {
        // Simulamos autenticación
        return "usuario".equals(usuario) && "contraseña".equals(contraseña);
    }

    @Override
    public void mostrarSaldo(String cuentaId) {
        if (autenticado) {
            servicioBanco.mostrarSaldo(cuentaId);
        } else {
            System.out.println("Acceso denegado: autenticación fallida.");
        }
    }

    @Override
    public void depositar(String cuentaId, double monto) {
        if (autenticado) {
            servicioBanco.depositar(cuentaId, monto);
        } else {
            System.out.println("Acceso denegado: autenticación fallida.");
        }
    }
}
