package Unidad5.InterpolacionLagrange;

public class Main {
    public static void main(String[] args) {
        // Puntos de ejemplo del ejercicio en clase: (1, 2), (2, 3), (4, 10)
        double[] x = {1.0, 2.0, 4.0};
        double[] y = {2.0, 3.0, 10.0};

        // Punto intermedio a interpolar
        double xEval = 3.0;

        // // Definir un conjunto de nodos: (0, 1), (1, 3), (2, 2), (3, 5)
        // double[] x = {0.0, 1.0, 2.0, 3.0};
        // double[] y = {1.0, 3.0, 2.0, 5.0};

        // // Punto de evaluación a libre elección
        // double xEval = 1.5;

        // Evaluar en x = 3
        double yInterpolado = InterpolacionLagrange.interpolacionLagrange(x, y, xEval);

        System.out.println("--- RESULTADO DE LA INTERPOLACIÓN ---");
        System.out.printf("El valor estimado en x = %.2f es P(%.2f) = %.4f\n", xEval, xEval, yInterpolado);
    }
}