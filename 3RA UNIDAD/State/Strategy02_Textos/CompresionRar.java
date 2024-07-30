package Strategy02_Textos;
public class CompresionRar  implements EstrategiaCompresion {
    @Override
    public void comprimir(String archivo) {
        System.out.println("Comprimiendo " + archivo + " en formato RAR.");
    }

}
