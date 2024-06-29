package Interpreter2_OperadorMatematicoBasico;
public class ExpresionParser {
    private final String fuente;
    private int indice;

    public ExpresionParser(String fuente) {
        this.fuente = fuente;
        this.indice = 0;
    }

    public Expresion parse() {
        return parseExpresion();
    }

    private Expresion parseExpresion() {
        Expresion resultado = parseTermino();
        while (indice < fuente.length()) {
            char operador = fuente.charAt(indice);
            if (operador != '+' && operador != '-') break;
            indice++;
            Expresion siguienteTermino = parseTermino();
            if (operador == '+') {
                resultado = new OperadorSuma(resultado, siguienteTermino);
            } else {
                resultado = new OperadorResta(resultado, siguienteTermino);
            }
        }
        return resultado;
    }

    private Expresion parseTermino() {
        int inicio = indice;
        while (indice < fuente.length() && Character.isDigit(fuente.charAt(indice))) {
            indice++;
        }
        int numero = Integer.parseInt(fuente.substring(inicio, indice));
        return new Numero(numero);
    }
}
