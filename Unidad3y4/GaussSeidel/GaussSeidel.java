package Unidad3y4.GaussSeidel;

import Unidad3y4.Jacobi.Jacobi;

public class GaussSeidel {

    /**
     * Método para resolver un sistema de ecuaciones lineales Ax = b usando Gauss-Seidel.
     * 
     * @param A Matriz de coeficientes.
     * @param b Vector de términos independientes.
     * @param xInicial Vector con los valores iniciales (aproximación).
     * @param tol Tolerancia para el criterio de parada.
     * @param maxIter Número máximo de iteraciones permitidas.
     * @return El vector solución aproximado.
     */
    public static double[] resolver(double[][] A, double[] b, double[] xInicial, double tol, int maxIter) {
        int n = xInicial.length;
        
        // Clonamos el xInicial del main a x.
        // Usamos un solo vector que evoluciona al instante (in-place).
        double[] x = xInicial.clone(); 

        // Ciclo principal de iteraciones (controla el límite de vueltas para evitar loops infinitos)
        for (int iter = 0; iter < maxIter; iter++) {
            
            // Respaldamos el estado anterior para poder calcular el error al final de la vuelta
            double[] xAnt = x.clone();

            // Recorremos cada renglón o ecuación del sistema de arriba hacia abajo
            for (int i = 0; i < n; i++) {
                
                double suma = b[i]; // Arrancamos la suma con el término independiente b_i

                // Recorremos las columnas del sistema
                for (int j = 0; j < n; j++) {
                    
                    // Omitimos la diagonal principal (j == i), 
                    // ya que ese coeficiente no se resta aquí (se usa al final para despejar)
                    if (j != i) {
                        // Usa los valores frescos en tiempo real (esto diferencia a Gauss-Seidel de Jacobi)
                        suma -= A[i][j] * x[j]; 
                    }
                }
                
                // Actualización directa (despejamos y guardamos en el mismo vector)
                // x_i = (b_i - sumatoria(a_ij * x_j)) / a_ii
                x[i] = suma / A[i][i]; 
            }

            // Usamos la función para calcular el error (compara el vector viejo con el recién calculado)
            if (Jacobi.calcularError(xAnt, x) < tol) {
                return x; // Si la tolerancia es menor a lo pedido, encontramos la solución y salimos
            }
        }

        // Si se acaba el límite de iteraciones sin converger, regresa la aproximación actual
        return x; 
    }
}