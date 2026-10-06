package Unidad1y2.MetodoFalsaPosicion;

public class FalsaPosicion {

    public static double f(double x) {
        return (4 * Math.pow(x, 2)) - (5 * x);
    }

    public static void imprimirSeparador() {
        System.out.println("-".repeat(95));
    }

    public static String Espacio(int n) {
        return " ".repeat(n);
    }

    public static void imprimirEncabezado() {
        imprimirSeparador();
        System.out.printf("|%s", Espacio(2) + "i" + Espacio(2)); // 5
        System.out.printf("|%s", Espacio(4) + "a" + Espacio(4)); // 9
        System.out.printf("|%s", Espacio(4) + "b" + Espacio(4)); // 9
        System.out.printf("|%s", Espacio(4) + "xr" + Espacio(4)); // 10
        System.out.printf("|%s", Espacio(4) + "f(xr)" + Espacio(4)); // 13
        System.out.printf("|%s", Espacio(4) + "|xr(i)-xr(i-1)|" + Espacio(4)); // 23
        System.out.printf("|%s", Espacio(4) + "|f(xr)|" + Espacio(4)); // 15
        System.out.println("|");
        imprimirSeparador();
    }

    public static void imprimirFila(int i, double a, double b, double xr, double fxr, double errorDex, double residuoDef) {
        System.out.printf("|%5d", i); // 5
        System.out.printf("|%9.6f", a); // 9
        System.out.printf("|%9.6f", b); // 9
        System.out.printf("|%10.6f", xr); // 10
        System.out.printf("|%13.6f", fxr); // 13
        if (i == 0) {
            System.out.printf("|%23s", "----- "); // 23
        } else {
            System.out.printf("|%23.6f", errorDex); // 23
        }
        System.out.printf("|%15.6f", residuoDef); // 15
        System.out.println("|");
    }

    public static double falsaPosicion(double a, double b, double tol, int maxIter) {
        if (f(a) * f(b) >= 0) {
            System.out.println("El método no se puede aplicar en el intervalo dado.");
            return Double.NaN;
        }

        imprimirEncabezado();

        double xr = a;

        for (int i = 0; i < maxIter; i++) {
            double fa = f(a);
            double fb = f(b);

            // FÓRMULA DE FALSA POSICIÓN
            double xrAnterior = xr;
            xr = b - (fb * (a - b)) / (fa - fb);

            // CONDICIÓN DE PARO (Error en x () OR Residuo de f)
            if ((i != 0 && Math.abs(xr - xrAnterior) < tol) || Math.abs(f(xr)) < tol) {
                imprimirFila(i, a, b, xr, f(xr), Math.abs(xr - xrAnterior), Math.abs(f(xr)));
                imprimirSeparador();
                return xr;
            }

            imprimirFila(i, a, b, xr, f(xr), Math.abs(xr - xrAnterior), Math.abs(f(xr)));

            if (fa * f(xr) < 0) {
                b = xr;
            } else {
                a = xr;
            }
        }

        // Se alcanzo el número máximo de iteraciones
        return xr;
    }

    public static void main(String[] args) {
        double raiz = falsaPosicion(1.0, 1.6, 1e-5, 100);
        System.out.println("Raiz aproximada (Falsa Posicion): " + raiz);
    }
}
