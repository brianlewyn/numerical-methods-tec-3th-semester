package Unidad1y2.MetodoPuntoFijo;

public class Tabla {

    /** Imprimir el separador de la tabla de convergencia. */
    public static void imprimirSeparador() {
        System.out.println("-".repeat(53));
    }

    /** Imprimir una fila de la tabla de convergencia. */
    public static void imprimirFila(int iter, double xAnterior, double xNuevo, double error) {
        System.out.printf("|%-12d|%-12.8f|%-12.8f|%-12.8f|\n", iter, xAnterior, xNuevo, error);
    }

    /** Imprimir el encabezado de la tabla de convergencia. */
    public static void imprimirEncabezado() {
        System.out.printf("|%-12s|%-12s|%-12s|%-12s|\n", "Iteración", "xAnterior", "xNuevo", "Error");
        imprimirSeparador();
    }

    /** Imprimir el mensaje final indicando si se alcanzó la convergencia. */
    public static void imprimirConclusion(boolean convergio, int iter, double xNuevo) {
        imprimirSeparador();
        if (convergio) {
            System.out.printf("→ Convergencia alcanzada: x ≈ %.8f  (en %d iteraciones).\n", xNuevo, iter);
        } else {
            System.out.printf("→ No se alcanzó la tolerancia en %d iteraciones.\n", iter);
        }
    }

}
