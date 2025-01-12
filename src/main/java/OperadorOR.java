public class OperadorOR {
    public static void main(String[] args) {
        System.out.println("*** Operador OR ***");
        // or (regresa true si cualquiera de los valores es true)
        boolean a = true, b = false;
        var resultado = a || b;
        System.out.println("resultado = " + resultado);
    }
}
