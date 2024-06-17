package Facade05;
import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        SistemaRegistroFacade sistema = new SistemaRegistroFacade();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nusuario: profesor, contraseña: 1234");
        //ejemplo de login

        System.out.print("Ingrese el usuario: ");
        String usuario = scanner.next();

        System.out.print("Ingrese la contraseña: ");
        String contraseña = scanner.next();

        if (sistema.autenticarProfesor(usuario, contraseña)) {
            System.out.println("Autenticación exitosa.");
            System.out.println("Bienvenido Profesor");
            System.out.println("=================================");

            while (true) {
                System.out.println("\n=== Menú de Registro de Notas ===");
                System.out.println("1. Registrar Nota");
                System.out.println("2. Salir");
                System.out.print("Seleccione una opción: ");
                System.out.println("\n=================================");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Lista de alumnos:");
                        List<Alumno> alumnos = sistema.obtenerListaAlumnos();
                        for (Alumno alumno : alumnos) {
                            System.out.println("ID: " + alumno.getId() + ", Nombre: " + alumno.getNombre());
                        }   System.out.print("Ingrese el ID del alumno: ");
                        int idAlumno = scanner.nextInt();
                        System.out.print("Ingrese la nota del alumno: ");
                        double nota = scanner.nextDouble();
                        System.out.println("=================================================");
                        sistema.registrarNota(idAlumno, nota);
                        System.out.println("=================================================");
                        break;
                    case 2:
                        System.out.println("Saliendo del sistema.");
                        System.out.println("\n=================================");
                        break;
                    default:
                        System.out.println("Opción inválida, por favor intente nuevamente.");
                        System.out.println("\n==============================================");
                        break;
                }
            }
        } else {
            System.out.println("Autenticación fallida. Usuario o contraseña incorrectos.");
            System.out.println("\n========================================================");
        }
        scanner.close();
    }
    
}
