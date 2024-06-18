package Fancade02_Biblioteca;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        WebServiceBiblioteca webServiceBiblioteca = new Facade();
        System.out.println(webServiceBiblioteca.documento(0));
        System.out.println(webServiceBiblioteca.documento(1));
        List<String> resultados = webServiceBiblioteca.buscaLibros(20, 5);
        if (resultados.size() > 0) {
            System.out.println("Libro(s) cuyo precio está comprendido entre 15 y 25");
            for (String resultado : resultados) {
                System.out.println(" " + resultado);
            }
        }
    }
    
}
