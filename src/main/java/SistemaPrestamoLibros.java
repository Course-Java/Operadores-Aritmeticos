import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Prestamo Libros ***");

        final var KM_REDONDA_NECESARIOS = 3;

        var consola = new Scanner(System.in);

        System.out.print("¿El usuario tiene credencial de estudiante? (true / false): ");
        var tieneCredencialEstudiante = Boolean.parseBoolean(consola.nextLine());

        System.out.print("¿A cuantos km a la redonda vive el usuario?: ");
        var kmRedonda = Integer.parseInt(consola.nextLine());

        var esAptoPrestamoLibros = kmRedonda <= 3 || tieneCredencialEstudiante;
        System.out.println("El usuario tiene acceso al préstamo de libros? : " + esAptoPrestamoLibros);
    }
}
