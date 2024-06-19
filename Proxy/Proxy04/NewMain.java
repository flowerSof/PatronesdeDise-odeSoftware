package Proxy04;
import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //usuario: usuario
        //contraseña: contraseña
        
        System.out.print("Ingrese el usuario: ");
        String usuario = scanner.next();

        System.out.print("Ingrese la contraseña: ");
        String contraseña = scanner.next();

        Banco banco = new BancoProxy(usuario, contraseña);

        if (banco instanceof BancoProxy && ((BancoProxy) banco).autenticado) {
            while (true) {
                System.out.println("\n=== Menú de Operaciones Bancarias ===");
                System.out.println("1. Mostrar Saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();

                if (opcion == 1) {
                    System.out.print("Ingrese el ID de la cuenta: ");
                    String cuentaId = scanner.next();
                    banco.mostrarSaldo(cuentaId);
                } else if (opcion == 2) {
                    System.out.print("Ingrese el ID de la cuenta: ");
                    String cuentaId = scanner.next();

                    System.out.print("Ingrese el monto a depositar: ");
                    double monto = scanner.nextDouble();

                    banco.depositar(cuentaId, monto);
                } else if (opcion == 3) {
                    System.out.println("Saliendo del sistema.");
                    break;
                } else {
                    System.out.println("Opción inválida, por favor intente nuevamente.");
                }
            }
        } else {
            System.out.println("Autenticación fallida. Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
    
}
