package Strategy02_Textos;
public class CompresorArchivos {
    private EstrategiaCompresion estrategia;

    public void setEstrategia(EstrategiaCompresion estrategia) {
        this.estrategia = estrategia;
    }

    public void comprimirArchivo(String archivo) {
        estrategia.comprimir(archivo);
    }

}
