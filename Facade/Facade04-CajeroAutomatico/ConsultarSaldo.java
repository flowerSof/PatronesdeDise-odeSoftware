package Facade04;

public class ConsultarSaldo {
    public void consultarSaldo(Cuenta cuenta) {
        System.out.println("El saldo para la cuenta " + cuenta.getNumeroCuenta() + " es: $" + cuenta.getSaldo());
    }
}
