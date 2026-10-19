package Unidad3y4.Jacobi;

public class Jacobi {

    /**
     * Resuelve un sistema de ecuaciones lineales Ax = b
     * mediante el método iterativo de Jacobi.
     * 
     * @param A matriz de coeficientes (cuadrada)
     * @param b vector de términos independientes
     * @param x0 vector de aproximación inicial
     * @param tol tolerancia a error máximo permitido
     * @param maxIter número máximo de iteraciones
     * @return vector con la solución aproximada
     */
    public static double[] resolver(double[][] A, double[] b, double[] x0, double tol, int maxIter) {
        int n = b.length;
        double[] x = x0.clone(); // Copio la aproximación actual
        double[] xNuevo = new double[n]; // Vector para almacenar la nueva aproximación

        // Ciclo principal de iteraciones
        for (int k=0; k<maxIter; k++) {
            // System.out.printf("Iter: %d\n", k+1);

            // Su función es repetir el cálculo una y otra vez
            // para ir afinando la respuesta con un límite máximo

            // Cálculo de cada variable para la nueva iteración
            for (int i=0; i<n; i++) {
                double suma = 0.0; // Tenemos que resetear la suma de cada fila

                // Sumatoria de los términos A[i][j] * x[j] excluyendo la diagonal (j != i)
                for (int j=0; j<n; j++){
                    // Cada columna

                    if (j != i) { // Tenemos que sumar todos excepto los de la diagonal
                        suma += A[i][j] * x[i]; // xj: valores x, y, z
                    }
                }

                // Fórmula de despeje de Jacobi: x_j = (b_i - suma) / A[i][i]
                xNuevo[i] = (b[i] - suma) / A[i][i];
            }

            // Evalúa si ya se alcanzó la precisión deseada (criterio de parada)
            if (calcularError(x, xNuevo) < tol) {
                return xNuevo; // Convergió con éxito
            }

            // Actualiza el vector para la siguiente iteración si es que todavía el error es muy grande
            x = xNuevo.clone();
        }

        // Retorna la última aproximación si se agotan las iteraciones sin converger del todo
        return xNuevo;
    }
    
    // Calcula el error máximo absoluto entre dos vectores (Norma Infinito)
    public static double calcularError(double[] xAnt, double[] xNuevo) {
        double max = 0.0;

        for (int i=0; i<xAnt.length; i++) {
            // Encuentra la máxima diferencia absoluta entre elementos correspondientes
            max = Math.max(max, Math.abs(xNuevo[i] - xAnt[i]));
        }

        return max;
    }
}