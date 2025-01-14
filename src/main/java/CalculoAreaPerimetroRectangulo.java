import java.util.Scanner;

public class CalculoAreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("Cálculo Área y Perímetro de un Rectángulo");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese la altura del rectángulo: ");
        var altura = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese la base del rectángulo: ");
        var base = Integer.parseInt(consola.nextLine());

        var area = base * altura;
        var perimetro = 2 * (base + altura);

        System.out.printf("""
                %n-----------------------------
                Resultado:
                Área del rectángulo: %d
                Perímetro del rectángulo: %d
                -----------------------------
                """, area, perimetro);
    }
}
