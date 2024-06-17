package Facade04;

public class Retirar {
    
    public void retirarDinero(Cuenta cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldo();
        if (saldoActual >= cantidad) {
            cuenta.setSaldo(saldoActual - cantidad);
            System.out.println("Retiro de $" + cantidad + " exitoso" );
        } else {
            System.out.println("Fondos insuficientes para el retiro."+"  Saldo actual: $" + cuenta.getSaldo());
        }
    }
    
}
