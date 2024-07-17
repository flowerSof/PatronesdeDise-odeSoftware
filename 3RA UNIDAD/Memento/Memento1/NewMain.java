package Memento1;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Formulario formulario = new Formulario();
        FormularioMemento memento = null;
        
        while (true) {
            System.out.println("Formulario - Página 1: Nombre");
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            formulario.setNombre(nombre);
            memento = formulario.guardar();
            
            System.out.println("1. Siguiente Página");
            System.out.println("2. Restaurar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 2 && memento != null) {
                formulario.restaurar(memento);
                System.out.println("Estado restaurado.");
                continue;
            } else if (opcion == 3) {
                break;
            }

            System.out.println("Formulario - Página 2: Dirección");
            System.out.print("Ingrese su dirección: ");
            String direccion = scanner.nextLine();
            formulario.setDireccion(direccion);
            memento = formulario.guardar();
            
            System.out.println("1. Siguiente Página");
            System.out.println("2. Restaurar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 2 && memento != null) {
                formulario.restaurar(memento);
                System.out.println("Estado restaurado.");
                continue;
            } else if (opcion == 3) {
                break;
            }

            System.out.println("Formulario - Página 3: Teléfono");
            System.out.print("Ingrese su teléfono: ");
            String telefono = scanner.nextLine();
            formulario.setTelefono(telefono);
            memento = formulario.guardar();
            
            System.out.println("1. Siguiente Página");
            System.out.println("2. Restaurar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 2 && memento != null) {
                formulario.restaurar(memento);
                System.out.println("Estado restaurado.");
                continue;
            } else if (opcion == 3) {
                break;
            }

            System.out.println("Formulario - Página 4: Email");
            System.out.print("Ingrese su email: ");
            String email = scanner.nextLine();
            formulario.setEmail(email);
            memento = formulario.guardar();
            
            System.out.println("1. Completar Formulario");
            System.out.println("2. Restaurar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 2 && memento != null) {
                formulario.restaurar(memento);
                System.out.println("Estado restaurado.");
            } else if (opcion == 1) {
                System.out.println("Formulario completado:");
                System.out.println(formulario.mostrarEstado());
                break;
            } else if (opcion == 3) {
                break;
            }
        }
    }
}
