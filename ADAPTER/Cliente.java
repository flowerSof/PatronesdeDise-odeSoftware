package ADAPTER;
import java.util.Scanner;
public class Cliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //
        System.out.print("Ingresar CONTENIDO txt: ");
        String contenido = teclado.next();
        
        Documento documento1; 
        documento1 = new Documentotxt();
        
        documento1.setContenido(contenido);
        documento1.escribir(); 
        System.out.println();
        
        
        
        System.out.print("Ingresar CONTENIDO pdf: ");
        String contenido2 = teclado.next();
        
        Documento documento2; 
        documento2 = new DocumentoPdf();
        
        documento1.setContenido(contenido2);
        documento2.imprime();
    }
    
}
