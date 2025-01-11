public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("*** Operadores Aritmeticos ***");
        double a = 5, b = 3, resultado;
        // Suma +
        resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        // Resta -
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        // Multiplicación *
        resultado = a * b;
        System.out.println("resultado multiplicación = " + resultado);
        // División
        resultado = a / b;
        System.out.println("resultado división = " + resultado);
        // Módulo (residuo división) %
        resultado = a % b;
        System.out.println("resultado módulo = " + resultado);
    }
}

/*
 * NOTAS:
 * En una misma línea, puedes inicializar varias variables indicando el tipo. Sin embargo, no aplica cuando usemos var
 * El valor por default de un tipo entero es 0, por lo tanto, no es necesario inicializarlo (en este caso, resultado)
 */