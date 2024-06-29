package Interpreter1_Operadores_Logicos;
import java.util.Scanner;
public class MainCliente {
    public static void main(String[] args) {
        Expresion expresionConsulta = null;
        Scanner reader = new Scanner(System.in);
        System.out.print("Introduzca su consulta: ");
        String consulta = reader.nextLine();
        try {
            expresionConsulta = Expresion.analiza(consulta);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            expresionConsulta = null;
        }
        if (expresionConsulta != null) {
            System.out.print("Introduzca la descripción de un vehículo: ");
            String descripcion = reader.nextLine();
            if (expresionConsulta.evalua(descripcion))
                System.out.print("La descripción SIIIIIIIIIIIIIII responde a la consulta");
            else
                System.out.print("La descripción NOOOOOOOOOOOOOOO responde a la consulta");
        }
    }
    
}
