import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");

        final var USER = "admin";
        final var PASSWORD = "123";

        var consola = new Scanner(System.in);

        System.out.print("Cual es tu usuario? ");
        var user = consola.nextLine();

        System.out.print("Cual es tu password? ");
        var password = consola.nextLine();

        var esCorrecto = user.equals(USER) && password.equals(PASSWORD);

        System.out.println("Datos son correctos? " + esCorrecto);
    }
}
