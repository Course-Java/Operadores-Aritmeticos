public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a  = 3, b = -2, resultado;
        var c = true;
        // Operador unario +
        resultado  = +a;
        System.out.println("+a = " + resultado);
        // Operador unario -
        resultado = -a;
        System.out.println("-a = " + resultado);
        // Operadores unarios de incremento / decremento
        // Pre-incremento
        a = 3;
        resultado = ++a; // primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incrementó = " + a);
        // Post-incremento
        a = 3;
        resultado = a++; // primero se usa el valor y después se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa = " + a);

        // Pre-decremento
        resultado = --b; // primero se incrementa y después se usa el valor
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se incrementó = " + b);
        // Post-decremento
        b = -2;
        resultado = b--; // primero se usa el valor, y después se incrementa
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento se decrementa = " + b);
    }
}

/*
 * El operador unario sirve para definir el signo del número (en este caso se indica que es un número positivo, pero cómo esa característica es por default, casi nunca se usa (otro caso es si usamos el signo negativo))
 * El operador unario de pre-incremento (++a) sirve para incrementar uno en uno el número seleccionado (este incremente se reasigna a la variable)
 * El operador unario de post-incremento (a++) no incrementa al instante, si no deja un incremento pendiente y, en el siguiente uso del número, ahí recién se asigna el incremento
 * El mismo caso es para el decremento (pre-decremento y post-decremento)
 */