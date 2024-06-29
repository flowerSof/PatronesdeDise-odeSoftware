package Interpreter2_OperadorMatematicoBasico;
public class MainCalculadora {
    public static void main(String[] args) {
        String expresion = "7+3-2";
        Expresion resultado = Expresion.parsea(expresion);
        System.out.println("Resultado: " + resultado.evalua());
    }
    
}
