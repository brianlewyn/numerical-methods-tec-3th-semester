package Unidad3y4.Jacobi;

public class Main {
    public static void main(String[] args) {
        // Cargamos la matriz y los vectores desde la clase externa
        double[][] A = DefMatriz.obtenerMatrizA();
        double[] b = DefMatriz.obtenerVectorB();
        double[] x0 = DefMatriz.obtenerVectorX0();

        // Parámetros de tolerancia y límite de iteraciones
        double tol = 1e-4;
        int maxIter = 100;

        // Llamada al método resolver
        double[] solucion = Jacobi.resolver(A, b, x0, tol, maxIter);

        // Imprimir el resultado final
        System.out.print("Solución aproximada: [");
        for (double val : solucion) {
            System.out.printf("%.5f ", val);
        }
        System.out.println("]");
    }
}