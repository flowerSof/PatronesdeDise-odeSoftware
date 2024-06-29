package Interpreter1_Operadores_Logicos;
public class OperadorNo extends Expresion {
    private Expresion operando;

    public OperadorNo(Expresion operando) {
        this.operando = operando;
    }

    public boolean evalua(String descripcion) {
        return !operando.evalua(descripcion);
    }

    public static Expresion parsea() throws Exception {
        Expresion resultado;
        if (pieza.equals("no")) {
            siguientePieza();
            resultado = new OperadorNo(Expresion.parsea());
        } else {
            resultado = PalabraClave.parsea();
        }
        return resultado;
    }
}
