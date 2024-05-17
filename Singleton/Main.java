package Singleton;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        do{
            System.out.println("¿Desea crear una cuenta con su correo? (s/n)" );
            a=scanner.next();

            if ("s".equals(a)){
                CuentaGmail.getInstancia();
                System.out.println("----------------------------------------");
            }
        }while (!"n".equals(a));
    }
}
