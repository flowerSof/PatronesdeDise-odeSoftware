package Interpreter1_Operadores_Logicos;
public abstract class Expresion {
    public abstract boolean evalua(String descripcion); 
 
    protected static String fuente; 
    protected static int indice; 
    protected static String pieza; 
 
    protected static void siguientePieza() {
        while ((indice < fuente.length()) && (fuente.charAt(indice) == ' ')) 
            indice++; 
        if (indice != fuente.length()) { 
            if ((fuente.charAt(indice) == '(') || (fuente.charAt(indice) == ')')) {
                pieza = fuente.substring(indice, indice + 1);
                indice++;
            } else {
                int inicio = indice;
                while ((indice < fuente.length()) && (fuente.charAt(indice) != ' ') && (fuente.charAt(indice) != ')'))
                    indice++;
                pieza = fuente.substring(inicio, indice);
            } 
        } else {
            pieza = null;
        }
    } 

    public static Expresion analiza(String fuente) throws Exception { 
        Expresion.fuente = fuente; 
        indice = 0; 
        siguientePieza(); 
        return OperadorO.parsea(); 
    } 

    public static Expresion parsea() throws Exception {
        Expresion resultado;
        switch (pieza) {
            case "(" -> {
                siguientePieza();
                resultado = OperadorO.parsea();
                if (pieza == null)
                    throw new Exception("Error de sintaxis");
                if (!pieza.equals(")"))
                    throw new Exception("Error de sintaxis");
                siguientePieza();
            }
            case "no" -> {
                siguientePieza();
                resultado = new OperadorNo(parsea());
            }
            default -> resultado = PalabraClave.parsea();
        }
        return resultado;
    }
}

