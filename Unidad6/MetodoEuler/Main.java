package Unidad6.MetodoEuler;

public class Main {
    public static void main(String[] args) {
        double x0 = 0.0;
        double y0 = 1.0;
        double xFinal = 0.3;

        MetodoEuler.resolver(x0, y0, 0.1, xFinal);
        MetodoEuler.resolver(x0, y0, 0.05, xFinal);
        MetodoEuler.resolver(x0, y0, 0.01, xFinal);
    }
}
