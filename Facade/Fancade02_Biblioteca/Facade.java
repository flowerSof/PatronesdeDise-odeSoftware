package Fancade02_Biblioteca;

import java.util.List;

public class Facade implements WebServiceBiblioteca {
    protected CatalogoLibros catalogoLibros = new ComponenteCatalogoLibros();
    protected GestionDocumentoLibros gestionDocumentoLibros = new ComponenteGestionDocumentoLibros();

    public String documento(int indice) {
        return gestionDocumentoLibros.documento(indice);
    }

    public List<String> buscaLibros(int precioMedio, int desviacionMax) {
        return catalogoLibros.buscaLibros(precioMedio - desviacionMax, precioMedio + desviacionMax);
    }
}

