package Strategy02_Textos;
public class CompresionZip implements EstrategiaCompresion {
    @Override
    public void comprimir(String archivo) {
        System.out.println("Comprimiendo " + archivo + " en formato ZIP.");
    }

}
