package Fancade02_Biblioteca;
import java.util.ArrayList;
import java.util.List;
public class ComponenteCatalogoLibros implements CatalogoLibros{
    protected Object[] descripcionLibros = {
        "El Quijote", 20, "Cien Años de Soledad", 15,
        "La Sombra del Viento", 25, "El Hobbit", 10,
        "1984", 30, "Donde los Árboles Cantan", 18
    };

    public List<String> buscaLibros(int precioMin, int precioMax) {
        int tamaño = descripcionLibros.length / 2;
        List<String> resultado = new ArrayList<>();
        for (int indice = 0; indice < tamaño; indice++) {
            int precio = (Integer) descripcionLibros[2 * indice + 1];
            if ((precio >= precioMin) && (precio <= precioMax)) {
                resultado.add((String) descripcionLibros[2 * indice]);
            }
        }
        return resultado;
    }
}
