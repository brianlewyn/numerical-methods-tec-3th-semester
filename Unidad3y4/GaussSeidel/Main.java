package Unidad3y4.GaussSeidel;

import Unidad3y4.Jacobi.DefMatriz;

public class Main {
    public static void main(String[] args) {
        // Reciclamos A y b directamente desde DefMatriz de Jacobi
        // (Asegúrate de que en DefMatriz estén declaradas como public static double[][] A y public static double[] b)
        double[][] A = DefMatriz.obtenerMatrizA();
        double[] b = DefMatriz.obtenerVectorB();

        // Vector de aproximación inicial (ceros) con el tamaño dinámico basado en b
        double[] xInicial = new double[b.length];

        // Tolerancia y número máximo de iteraciones
        double tol = 1e-5;
        int maxIter = 100;

        // Llamada al método de Gauss-Seidel
        double[] resultado = GaussSeidel.resolver(A, b, xInicial, tol, maxIter);

        // Imprimir los resultados por consola
        System.out.println("Solución final obtenida por Gauss-Seidel (matriz reciclada de Jacobi):");
        
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("x[" + i + "] = " + resultado[i]);
        }
    }
}
