package Proxy04;

interface Banco {
    void mostrarSaldo(String cuentaId);
    void depositar(String cuentaId, double monto);
}
