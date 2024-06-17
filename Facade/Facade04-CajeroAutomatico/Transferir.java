package Facade04;

public class Transferir {
    public void transferirDinero(Cuenta cuenta, Cuenta cuentaDestino, double cantidad) {
        double saldoOrigen = cuenta.getSaldo();
        if (saldoOrigen >= cantidad) {
            cuenta.setSaldo(saldoOrigen - cantidad);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + cantidad);
            System.out.println("Transferencia de $" + cantidad + " exitosa de la cuenta " + cuenta.getNumeroCuenta() + " a la cuenta " + cuentaDestino.getNumeroCuenta());
        } else {
            System.out.println("Fondos insuficientes para la transferencia."+ "  Saldo actual: $" + cuenta.getSaldo());
        }
    }
}
