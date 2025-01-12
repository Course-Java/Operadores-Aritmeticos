import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema Descuentos VIP ***");

        final var ARTICULOS_NECESARIOS = 10;

        var consola = new Scanner(System.in);

        System.out.print("¿Cuantos articulos a comprado hoy?: ");
        var articulosPorDia = Integer.parseInt(consola.nextLine());

        System.out.print("¿Cuanta con membresía de la tienda? (true / false): ");
        var esMiembroTienda = Boolean.parseBoolean(consola.nextLine());

        var tendraAccesoVIP = articulosPorDia >= ARTICULOS_NECESARIOS && esMiembroTienda;
        System.out.println("Tienes acceso al descuento VIP? : " + tendraAccesoVIP);
    }
}
