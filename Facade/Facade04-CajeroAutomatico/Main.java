package Facade04;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CajeroAutomatico cajero = new CajeroAutomatico();
        int numeroCuenta;
        double cantidad;

        while (true) {
            System.out.println("/numero de cuenta: 12345 (para q funcione)");
            System.out.println("\n=== Bienvenido al Cajero Automático ===");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Transferir Dinero");
            System.out.println("4. Depositar Dinero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de cuenta: ");
                    numeroCuenta = scanner.nextInt();
                    Cuenta cuenta = cajero.getCuenta(numeroCuenta);
                    if (cuenta != null) {
                        cajero.consultarSaldo(cuenta);
                    } else {
                        System.out.println("La cuenta " + numeroCuenta + " no existe.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el número de cuenta: ");
                    numeroCuenta = scanner.nextInt();
                    cuenta = cajero.getCuenta(numeroCuenta);
                    if (cuenta != null) {
                        System.out.print("Ingrese el monto a retirar: ");
                        cantidad = scanner.nextDouble();
                        cajero.retirarDinero(cuenta, cantidad);
                    } else {
                        System.out.println("La cuenta " + numeroCuenta + " no existe.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el número de cuenta origen: ");
                    int cuentaOrigenNumero = scanner.nextInt();
                    Cuenta cuentaOrigen = cajero.getCuenta(cuentaOrigenNumero);
                    if (cuentaOrigen != null) {
                        System.out.print("Ingrese el número de cuenta destino: ");
                        int cuentaDestinoNumero = scanner.nextInt();
                        Cuenta cuentaDestino = cajero.getCuenta(cuentaDestinoNumero);
                        if (cuentaDestino != null) {
                            System.out.print("Ingrese el monto a transferir: ");
                            cantidad = scanner.nextDouble();
                            cajero.transferirDinero(cuentaOrigen, cuentaDestino, cantidad);
                        } else {
                            System.out.println("La cuenta destino " + cuentaDestinoNumero + " no existe.");
                        }
                    } else {
                        System.out.println("La cuenta origen " + cuentaOrigenNumero + " no existe.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el número de cuenta: ");
                    numeroCuenta = scanner.nextInt();
                    cuenta = cajero.getCuenta(numeroCuenta);
                    if (cuenta != null) {
                        System.out.print("Ingrese el monto a depositar: ");
                        cantidad = scanner.nextDouble();
                        cajero.depositarDinero(cuenta, cantidad);
                    } else {
                        System.out.println("La cuenta " + numeroCuenta + " no existe.");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar el Cajero Automático.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, por favor intente nuevamente.");
                    break;
            }
        }
    }
    
}
