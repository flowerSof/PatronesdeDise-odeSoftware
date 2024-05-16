package Builder;
import java.util.Scanner;
public class CLIENTE {
    public static void main(String[] args) {
        Cocinero director = new Cocinero();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación de pedidos de combos de comida rápida.");
        System.out.print("¿Qué tipo de combo desea (Infantil/Regular)?: ");
        String tipoCombo = scanner.nextLine();

        Combo combo = director.getBuilder(tipoCombo)
                .agregarPapas(tipoCombo.equalsIgnoreCase("Infantil") ? "pequeñas" : "grandes")
                .agregarBebida(tipoCombo.equalsIgnoreCase("Infantil") ? "Jugo de naranja" : "Coca cola")
                .agregarPizza(tipoCombo.equalsIgnoreCase("Infantil") ? "queso" : "pepperoni")
                .agregarHamburguesa(tipoCombo.equalsIgnoreCase("Infantil") ? "mini" : "doble")
                .build();

        combo.getPedido().mostrar();
    }
}
