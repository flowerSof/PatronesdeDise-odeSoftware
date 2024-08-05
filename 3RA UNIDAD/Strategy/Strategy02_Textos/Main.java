package Strategy02_Textos;
public class Main {
    public static void main(String[] args) {
        CompresorArchivos compresor = new CompresorArchivos();

        compresor.setEstrategia(new CompresionZip());
        compresor.comprimirArchivo("documento.txt");

        compresor.setEstrategia(new CompresionRar());
        compresor.comprimirArchivo("imagen.png");

    }
    
}
