package Unidad1y2.MetodoBiseccion;

public class Tabla {

    /** Imprimir el separador de la tabla de resultados. */
    public static void imprimirSeparador() {
        System.out.println("-".repeat(97));
    }

    /** Imprimir el encabezado de la tabla de resultados. */
    public static void imprimirEncabezado() {
        imprimirSeparador();
        System.out.printf("|%4s", "i");
        System.out.printf("|%9s", "a");
        System.out.printf("|%9s", "b");
        System.out.printf("|%9s", "xr");
        System.out.printf("|%9s", "f(xr)");
        System.out.printf("|%14s", "(a-b)/2 < tol");
        System.out.printf("|%14s", "Nuevo a o b");
        System.out.printf("|%20s", "[a, b]");
        System.out.println("|");
        imprimirSeparador();
    }

    /** Imprimir la parte 1 de una fila de la tabla de resultados. */
    public static void imprimirFilaParte1(int iter, double a, double b, double xr, double fxr) {
        System.out.printf("|%4d|%9.5f|%9.5f|%9.5f|%9.5f", iter, a, b, xr, fxr);
    }

    /** Imprimir la parte 2 de una fila de la tabla de resultados. */
    public static void imprimirFilaParte2(double tamaño, char dirección, double xr, double a, double b) {
        String nuevoCambio = String.format("%c = %7.5f", dirección, xr);
        String nuevoIntervalo = String.format("[%7.5f, %7.5f]", a, b);
        System.out.printf("|%14.5f|%14s|%20s|\n", tamaño, nuevoCambio, nuevoIntervalo);
    }

    /** Imprimir la parte 3 de una fila de la tabla de resultados. */
    public static void imprimirFilaParte3(double tamaño, double xr) {
        String raízAprox = String.format("(aprox) x = %10.8f", xr);
        System.out.printf("|%14.5f|%28s\n", tamaño, raízAprox);
        imprimirSeparador();
    }

}
