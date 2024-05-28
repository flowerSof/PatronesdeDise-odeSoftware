package Composite;
import java.util.ArrayList;
import java.util.List;
public class Padre extends Nodo {
    List<Nodo> hijos = new ArrayList<>();

    // ----------------------------
    public Padre(String nombre) {
        this.setTipoNodo(Nodo.CASADO);
        this.setNombre(nombre);
    }

    // ----------------------------
    public void agregarHijo(Nodo hijo) {
        hijos.add(hijo);
    }

    // ----------------------------
    public void eliminarHijo(Nodo hijo) {
        hijos.remove(hijo);
    }

    // ----------------------------
    public List<Nodo> getHijos() {
        return hijos;
    }

    // ----------------------------
    public Nodo getHijo(int posicion) {
        return hijos.get(posicion);
    }

    @Override
    public void mostrar() {
        System.out.println("Padre: [" + this.getNombre() + "]");
        System.out.println("=====================================");
        for (Nodo hijo : hijos) {
            hijo.mostrar();
        }
    }
}
