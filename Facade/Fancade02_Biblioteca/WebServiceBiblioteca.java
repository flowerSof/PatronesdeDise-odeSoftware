package Fancade02_Biblioteca;
import java.util.List;
public interface WebServiceBiblioteca {
    String documento(int indice);
    List<String> buscaLibros(int precioMedio, int desviacionMax);
}
