package Facade04;

public class CajeroAutomatico {
    private ConsultarSaldo consultarSaldo;
    private Retirar retirar;
    private Transferir transferir;
    private Depositar depositar;
    private Cuenta cuenta1;

    public CajeroAutomatico() {
        this.consultarSaldo = new ConsultarSaldo();
        this.retirar = new Retirar();
        this.transferir = new Transferir();
        this.depositar = new Depositar();
        this.cuenta1 = new Cuenta(12345, 1000.0);
    }
    
    public Cuenta getCuenta(int numeroCuenta) {
        return cuenta1;
    }
    
    public void consultarSaldo(Cuenta cuenta) {
        consultarSaldo.consultarSaldo(cuenta);
    }

    public void retirarDinero(Cuenta cuenta, double cantidad) {
        retirar.retirarDinero(cuenta, cantidad);
    }

    public void transferirDinero(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
        transferir.transferirDinero(cuentaOrigen, cuentaDestino, cantidad);
    }

    public void depositarDinero(Cuenta cuenta, double cantidad) {
        depositar.depositarDinero(cuenta, cantidad);
    }
}
