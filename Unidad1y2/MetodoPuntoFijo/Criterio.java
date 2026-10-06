package Unidad1y2.MetodoPuntoFijo;

/** Define cómo medir el error entre dos aproximaciones consecutivas. */
public interface Criterio {

    /** Calcula el error entre la aproximación nueva y la anterior. */
    double error(double xNuevo, double xAnterior);

}
