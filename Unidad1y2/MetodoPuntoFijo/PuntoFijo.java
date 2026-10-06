package Unidad1y2.MetodoPuntoFijo;

public class PuntoFijo {
    private Evaluacion evaluacion;
    private Criterio criterio;

    public PuntoFijo(Evaluacion evaluacion, Criterio criterio) {
        this.evaluacion = evaluacion;
        this.criterio = criterio;
    } 

    /**
     * Ejecutar el Método del Punto Fijo para encontrar una raíz de f(x) = 0.
     * 
     * @param x0      valor semilla (aproximación inicial)
     * @param epsilon tolerancia del error absoluto (criterio de paro)
     * @param maxIter número máximo de iteraciones permitidas
     */
    public void ejecutar(double x0, double epsilon, int maxIter) {

        double errorAbsoluto;
        double xAnterior;
        double xNuevo = x0;
        int iter = 0;

        Tabla.imprimirEncabezado();

        do {
            xAnterior = xNuevo;

            xNuevo = evaluacion.g(xAnterior);
            errorAbsoluto = criterio.error(xNuevo, xAnterior);
            iter++;

            Tabla.imprimirFila(iter, xAnterior, xNuevo, errorAbsoluto);

        } while(errorAbsoluto >= epsilon && iter < maxIter);

        Tabla.imprimirConclusion(errorAbsoluto<epsilon, iter, xNuevo);
    }
}
