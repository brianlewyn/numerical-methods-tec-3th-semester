package Unidad6.MetodoRungeKutta;

public class SolucionExacta {

    // Solución analítica exacta: y = 2e^x - x - 1
    public static double evaluar(double x) {
        return 2 * Math.exp(x) - x - 1;
    }

}
