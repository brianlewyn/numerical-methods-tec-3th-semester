package Unidad1y2.MetodoBiseccion;

public class Main {
    public static void main(String[] args) {
        Evaluacion función;
        Biseccion biseccion;
        double raíz;

        // Caso 1:
        {
            System.out.println("\nEncontrar la raíz de: f(x) = 4x² - 5x, en el intervalo [1.0, 1.6],");
            System.out.println("usando una tolerancia de tol = 0.00001\n");

            // Mi función: f(x) = 4x² - 5x
            función = (x) -> (4 * Math.pow(x, 2)) - (5 * x);

            // Crear el algoritmo bisección a partir de un función dada.
            biseccion = new Biseccion(función);

            // Ejecutar la bisección en el intervalo [1.0, 1.6] con una tolerancia de 0.00001 y 100 iteraciones máx.
            raíz = biseccion.ejecutar(1.0, 1.6, 1e-5, 10);
            System.out.printf("\nRaíz aproximada: %.5f\n\n", raíz);
        }

        // Caso 2:
        {
            System.out.println("\nEncontrar la raíz de: f(x) = x² - 2, en el intervalo [1.0, 2.0],");
            System.out.println("usando una tolerancia de tol = 0.0001\n");

            // Mi función: f(x) = x² - 2
            función = (x) -> (Math.pow(x, 2)) - (2);

            // Crear el algoritmo bisección a partir de un función dada.
            biseccion = new Biseccion(función);

            // Ejecutar la bisección en el intervalo [1.0, 1.5] con una tolerancia de 0.0001 y 100 iteraciones máx.
            raíz = biseccion.ejecutar(1.0, 1.5, 1e-4, 100);
            System.out.printf("\nRaíz aproximada: %.5f\n\n", raíz);
        }

    }
}
