package Unidad5.RegresionLineal;

public class Main {
    public static void main(String[] args) {
        // Implementando el ejemplo visto en clase
        double[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] y = {40, 50, 55, 65, 70, 75, 85, 88, 95, 98};

        double [] resultado = RegresionLineal.calcularMinimosCuadrados(x, y);

        double xValor = 5.5;
        System.out.printf("\nRealizar una estimación para X = %.2f\n", xValor);

        double estimacion = RegresionLineal.predecir(resultado[0], resultado[1], xValor);
        System.out.printf("Y(%.2f) = %.2f\n", xValor, estimacion);
    }
}
