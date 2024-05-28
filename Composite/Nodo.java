package Composite;
public abstract class Nodo {
    public static final int SOLTERO = 1;
    public static final int CASADO = 2;
    protected String nombre = "";
    protected int tipoNodo;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoNodo() {
        return this.tipoNodo;
    }

    public void setTipoNodo(int tipoNodo) {
        this.tipoNodo = tipoNodo;
    }

    public abstract void mostrar();
}

