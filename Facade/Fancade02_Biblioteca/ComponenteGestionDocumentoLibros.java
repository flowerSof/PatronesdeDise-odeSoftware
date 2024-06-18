package Fancade02_Biblioteca;
public class ComponenteGestionDocumentoLibros implements GestionDocumentoLibros {
    public String documento(int indice) {
        return "Ficha del libro número " + indice;
    }
}
