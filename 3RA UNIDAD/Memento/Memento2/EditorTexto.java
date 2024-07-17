package Memento2;

public class EditorTexto {
    private StringBuilder contenido;

    public EditorTexto() {
        this.contenido = new StringBuilder();
    }

    public void escribir(String texto) {
        contenido.append(texto);
    }

    public String leer() {
        return contenido.toString();
    }

    public TextoMemento guardar() {
        return new TextoMemento(contenido.toString());
    }

    public void restaurar(TextoMemento memento) {
        contenido = new StringBuilder(memento.getEstado());
    }
}
