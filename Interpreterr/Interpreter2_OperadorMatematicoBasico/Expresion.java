package Interpreter2_OperadorMatematicoBasico;
public abstract class Expresion {
    public abstract int evalua();

    public static Expresion parsea(String fuente) {
        return new ExpresionParser(fuente).parse();
    }
}
