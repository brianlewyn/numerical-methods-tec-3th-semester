package Unidad1y2.MetodoPuntoFijo;

public class Main {
    public static void main(String[] args) {

        // Mi función: g(x) = √(x+2)
        Evaluacion funcion = (x) -> Math.sqrt(x + 2.0);

        double x0 = 1.0;         // Valor incial (semilla)
        double epsilon = 0.001;  // Critero de paro (tolerancia)
        int maxIter = 100;       // Límite de seguridad

        // Mi criterio de paro: Ea = |x_nuevo - x_anterior|
        Criterio errorAbsoluto = (xNuevo, xAnterior) -> {
            return Math.abs(xNuevo - xAnterior);
        };

        System.out.printf("\nMétodo de Punto Fijo (Error Absoluto):\n\n");
        (new PuntoFijo(funcion, errorAbsoluto)).ejecutar(x0, epsilon, maxIter);

        // Mi criterio de paro: Er(%) = |x_nuevo - x_anterior| / |x_nuevo| * 100
        Criterio errorPorcentual = (xNuevo, xAnterior) -> {
            return Math.abs(xNuevo - xAnterior) / Math.abs(xNuevo) * 100;
        };

        System.out.printf("\nMétodo de Punto Fijo (Error Porcentual):\n\n");
        (new PuntoFijo(funcion, errorPorcentual)).ejecutar(x0, epsilon, maxIter);

    }
}
