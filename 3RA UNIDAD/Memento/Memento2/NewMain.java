package Memento2;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EditorTexto editor = new EditorTexto();
        TextoMemento memento = null;
        
        while (true) {
            System.out.println("1. Escribir");
            System.out.println("2. Guardar");
            System.out.println("3. Restaurar");
            System.out.println("4. Leer");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese texto: ");
                    String texto = scanner.nextLine();
                    editor.escribir(texto);
                    break;
                case 2:
                    memento = editor.guardar();
                    System.out.println("Estado guardado.");
                    break;
                case 3:
                    if (memento != null) {
                        editor.restaurar(memento);
                        System.out.println("Estado restaurado.");
                    } else {
                        System.out.println("No hay estado guardado.");
                    }
                    break;
                case 4:
                    System.out.println("Contenido actual: " + editor.leer());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
