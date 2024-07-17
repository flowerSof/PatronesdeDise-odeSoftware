package Memento1;

public class Formulario {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String mostrarEstado() {
        return "Nombre: " + nombre + "\n" +
               "Dirección: " + direccion + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Email: " + email;
    }

    public FormularioMemento guardar() {
        return new FormularioMemento(nombre + "," + direccion + "," + telefono + "," + email);
    }

    public void restaurar(FormularioMemento memento) {
        String[] estado = memento.getEstado().split(",");
        this.nombre = estado[0];
        this.direccion = estado[1];
        this.telefono = estado[2];
        this.email = estado[3];
    }
}
