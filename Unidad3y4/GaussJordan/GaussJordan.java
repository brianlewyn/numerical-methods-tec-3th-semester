package Unidad3y4.GaussJordan;

import Unidad3y4.Gauss.Gauss;

public class GaussJordan {

    public static void resolver(double[][] matriz) {

        // 1. Matriz Escalonada Triangular
        escalonarMatriz(matriz);

        // 2. Matriz Identidad Reducida
        reducirMatriz(matriz);

    }

    private static void escalonarMatriz(double[][] matriz) {
        Gauss.eliminacionGaussiana(matriz);
    }

    /**
     * Convierte una matriz escalonada (resultado de Gauss) en su forma
     * reducida por Gauss-Jordan, haciendo 1 cada pivote y ceros arriba de él.
     * Se asume que la parte izquierda ya es triangular superior.
     */
    private static void reducirMatriz(double[][] matriz) {
        int n = matriz.length; // Obtener el total de filas.

        // Iterar desde el último renglón hasta el primer renglón de la matriz.
        for (int i = n-1; i >= 0; i--) {

            // Dividir toda la fila entre el pivote (para que sea 1).
            if (Math.abs(matriz[i][i] - 1.0) > 1e-10) {

                // Elemento pivote de la fila actual (diagonal principal).
                double pivote = matriz[i][i];

                // FilaPivote(i) = FilaPivote(i) / Pivote(i)(i)
                for (int k = i; k < matriz[i].length; k++) {
                    matriz[i][k] /= pivote;
                }
            }

            // Realizar un barrido superior para eliminar los coeficientes restantes.
            for (int j = i-1; j >= 0; j--) {

                // Valor que al multiplicar el pivote elimina al coeficiente superior.
                double factor = matriz[j][i];

                // FilaSuperior(j) = FilaSuperior(j) - factor(j)(i) * FilaPivote(i)
                for (int k = i; k < matriz[j].length; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }

        }

    }

}
