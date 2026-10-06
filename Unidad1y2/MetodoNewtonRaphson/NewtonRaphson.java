package Unidad1y2.MetodoNewtonRaphson;

public class NewtonRaphson {

    public static double f(double x) {
        return (4 * Math.pow(x, 2)) - (5 * x);
    }

    public static double df(double x) {
        return (8 * x) - 5;
    }

    public static void imprimirSeparador() {
        System.out.println("-".repeat(95));
    }

    public static String Espacio(int n) {
        return " ".repeat(n);
    }

    public static void imprimirEncabezado() {
        imprimirSeparador();
        System.out.printf("|%s", Espacio(2) + "n" + Espacio(2)); // 5
        System.out.printf("|%s", Espacio(4) + "x" + Espacio(4)); // 9
        System.out.printf("|%s", Espacio(4) + "f(x)" + Espacio(4)); // 12
        System.out.printf("|%s", Espacio(4) + "f'(x)" + Espacio(4)); // 13
        System.out.printf("|%s", Espacio(4) + "xNuevo" + Espacio(4)); // 14
        System.out.printf("|%s", Espacio(4) + "|xNuevo-xn|" + Espacio(4)); // 19
        System.out.printf("|%s", Espacio(4) + "|f(xNuevo)|" + Espacio(4)); // 19
        System.out.println("|");
        imprimirSeparador();
    }

    public static void imprimirFila(int n, double x, double fx, double dfx, double xNuevo, double errorDex, double residuoDef) {
        System.out.printf("|%5d", n); // 5
        System.out.printf("|%9.6f", x); // 9
        System.out.printf("|%12.6f", fx); // 12
        System.out.printf("|%13.6f", dfx); // 13
        System.out.printf("|%14.6f", xNuevo); // 14
        System.out.printf("|%19.6f", errorDex); // 19
        System.out.printf("|%19.6f", residuoDef); // 19
        System.out.println("|");
    }

    public static double newtonRaphson(double x0, double tol, int maxIter) {
        imprimirEncabezado();

        double x = x0;

        for (int i = 0; i < maxIter; i++) {
            double fx = f(x);
            double dfx = df(x);

            // Evitar división entre un valor cercano a cero
            if (Math.abs(dfx) < 1e-12) {
                imprimirFila(i, x, fx, dfx, Double.NaN, Double.NaN, Double.NaN);
                imprimirSeparador();

                System.out.println("Derivada cercana a cero. El método falla.");
                return Double.NaN;
            }

            // FÓRMULA DE NEWTON-RAPHSON
            double xNuevo = x - (fx / dfx);

            // CONDICIÓN DE PARO (Posicion OR Residuo de f)
            if (Math.abs(xNuevo - x) < tol || Math.abs(f(xNuevo)) < tol) {
                imprimirFila(i, x, fx, dfx, xNuevo, Math.abs(xNuevo - x), Math.abs(f(xNuevo)));
                imprimirSeparador();
                return xNuevo;
            }

            imprimirFila(i, x, fx, dfx, xNuevo, Math.abs(xNuevo - x), Math.abs(f(xNuevo)));

            x = xNuevo;
        }

        // Se alcanzo el número máximo de iteraciones
        return x;
    }

    public static void main(String[] args) {
        double raiz = newtonRaphson(1.0, 1e-5, 100);
        System.out.println("Raiz aproximada (Newton-Raphson): " + raiz);
    }
}
