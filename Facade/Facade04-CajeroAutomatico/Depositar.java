package Facade04;

public class Depositar {
    public void depositarDinero(Cuenta cuenta, double cantidad) {
        cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        System.out.println("Depósito de $" + cantidad + " exitoso. Nuevo saldo: $" + cuenta.getSaldo());
    }
}
