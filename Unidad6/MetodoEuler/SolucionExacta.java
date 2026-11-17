package Unidad6.MetodoEuler;

public class SolucionExacta {

    // Solución analítica exacta: y = x - 1 + 2e^-x
    public static double evaluar(double x) {
        return x - 1 + 2 * Math.exp(-x);
    }

}
