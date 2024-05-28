package Composite;
public class Hijo extends Nodo {
    public Hijo(String nombre) {
        this.setTipoNodo(Nodo.SOLTERO);
        this.setNombre(nombre);
    }

    @Override
    public void mostrar() {
        System.out.println("Hijo: [" + this.getNombre() + "]");
    }

}
