package Unidad1y2.MetodoBiseccion;

public class Biseccion {
    private Evaluacion evaluacion;

    public Biseccion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
    }

    /**
     * Aplica el algoritmo del método de bisección para encontrar la raíz de f(x).
     * 
     * @param a       Límite inferior del intervalo
     * @param b       Límite superior del intervalo
     * @param tol     Tolerancia o margen de error permitido
     * @param maxIter Número máximo de iteraciones
     * @return La raíz aproximada o Double.NaN si el intervalo no es válido
     */
    public double ejecutar(double a, double b, double tol, int maxIter) {

        // Verifica si hay cambio de signo en el intervalo (requisito del Teorema de Bolzano).
        if (evaluacion.f(a) * evaluacion.f(b) >= 0) {
            System.out.println("El método no se puede aplicar en el intervalo dado.");
            return Double.NaN;
        }

        Tabla.imprimirEncabezado();

        // Inicializa la variable para la raíz aproximada
        double xr = a;

        // Variables para facilitar la impresión de la tabla.
        double fxr;
        double tamaño;
        char dirección;

        for (int i = 0; i < maxIter; i++) {

            // Calcule el punto medio del intervalo actual
            xr = (a + b) / 2.0;

            Tabla.imprimirFilaParte1(i + 1, a, b, xr, (fxr = evaluacion.f(xr)));

            // Comprueba si se cumple la condición de parada (por tolerancia o tamaño del intervalo)
            if ((tamaño = Math.abs(fxr)) < tol || (tamaño = (b - a) / 2.0) < tol) {
                Tabla.imprimirFilaParte3(tamaño, xr);
                return xr;
            }

            // Evalua en que subintervalo se encuentra el cambio de signo y actualiza los límites
            if (evaluacion.f(a) * fxr < 0) {
                b = xr; // La raíz está en la mitad izquierda
                dirección = 'b';
            } else {
                a = xr; // La raíz está en la mitad derecha
                dirección = 'a';
            }

            Tabla.imprimirFilaParte2(tamaño, dirección, xr, a, b);
        }

        Tabla.imprimirSeparador();

        // Retorna la mejor aproximación alcanzada tras el límite de iteraciones
        return xr;
    }

}
