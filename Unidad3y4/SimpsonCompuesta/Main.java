package Unidad3y4.SimpsonCompuesta;

public class Main {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 2.0;
        double tolerancia = 0.0001;

        // Mandamos a llamar al método encapsulado
        double resultado = SimpsonCompuesto.integrarConTolerancia(a, b, tolerancia);

        System.out.println("Resultado final obtenido: " + resultado);
    }
}
