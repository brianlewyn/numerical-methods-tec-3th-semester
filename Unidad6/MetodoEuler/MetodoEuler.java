package Unidad6.MetodoEuler;

public class MetodoEuler {

    public static void resolver(double x0, double y0, double h, double xFinal) {
        int nPasos = (int) Math.round((xFinal - x0) / h);

        double x = x0;
        double y = y0;

        System.out.printf("%n----------- Método de Euler (h=%.2f) ------------%n", h);

        System.out.println("-------------------------------------------------");
        System.out.printf("%-5s %-10s %-10s %-10s %-10s%n", "n", "x", "Euler", "Exacta", "Error");
        System.out.println("-------------------------------------------------");

        double exacta = SolucionExacta.evaluar(x);
        double error = Math.abs(exacta - y);

        System.out.printf("%-5d %-10.4f %-10.4f %-10.4f %-10.4f%n", 0, x, y, exacta, error);

        for (int i = 0; i < nPasos; i++) {

            y += h * Funcion.evaluar(x, y);
            x += h;

            exacta = SolucionExacta.evaluar(x);
            error = Math.abs(exacta - y);

            System.out.printf("%-5d %-10.4f %-10.4f %-10.4f %-10.4f%n", i+1, x, y, exacta, error);
        }

        System.out.println("-------------------------------------------------");
        System.out.printf("(x, y) = (%.4f, %.4f)%n%n", x, y);
    }

}