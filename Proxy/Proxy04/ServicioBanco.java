package Proxy04;

public class ServicioBanco implements Banco{
    @Override
    public void mostrarSaldo(String cuentaId) {
        System.out.println("El saldo de la cuenta " + cuentaId + " es $1,000.00");
    }

    @Override
    public void depositar(String cuentaId, double monto) {
        System.out.println("Depositando $" + monto + " en la cuenta " + cuentaId);
    }
}
