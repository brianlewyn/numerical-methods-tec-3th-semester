package Unidad6.RK4CircuitoRLC;

public class RK4CircuitoRLC {

    // Vector de derivadas F(t, Y) donde Y[0] = y1 (carga) e Y[1] = y2 (corriente)
    private static double[] evaluarSistema(double t, double[] Y) {
        double y1 = Y[0];
        double y2 = Y[1];

        double dy1 = y2;             // y1' = q'  = y2
        double dy2 = -0.4 * y2 - y1; // y2' = q'' = -0.4*y2 - y1

        return new double[]{dy1, dy2};
    }

    // Suma vectorial escalada: res[i] = A[i] + factor * B[i]
    private static double[] sumaEscalada(double[] A, double factor, double[] B) {
        int n = A.length;
        double[] res = new double[n];

        for (int i = 0; i < n; i++) {
            res[i] = A[i] + factor * B[i];
        }

        return res;
    }

    private static double solucionExacta(double t, double wd) {
        return Math.exp(-0.2 * t) * (Math.cos(wd * t) + (0.2 / wd) * Math.sin(wd * t));
    }
    
    public static void resolver(int nPuntos, double h, double t, double[] Y) {
        // Parámetros de la solución exacta
        double wd = Math.sqrt(0.96);   // ≈ 0.979796

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("n\t t_n\t y1 (Carga)\t y2 (Corr)\t q_exacta\t error_abs");
        System.out.println("---------------------------------------------------------------------------");

        // Punto inicial
        double qExacta = solucionExacta(t, wd);
        double error = Math.abs(qExacta - Y[0]);

        System.out.printf("%d\t %.2f\t %.6f\t %.6f\t %.6f\t %.6f%n", 0, t, Y[0], Y[1], qExacta, error);

        for (int i = 0; i < nPuntos; i++) {
            double[] k1 = evaluarSistema(t, Y);
            double[] k2 = evaluarSistema(t + h / 2.0, sumaEscalada(Y, h / 2.0, k1));
            double[] k3 = evaluarSistema(t + h / 2.0, sumaEscalada(Y, h / 2.0, k2));
            double[] k4 = evaluarSistema(t + h, sumaEscalada(Y, h, k3));

            for (int j = 0; j < Y.length; j++) {
                Y[j] += (h / 6.0) * (k1[j] + 2.0 * k2[j] + 2.0 * k3[j] + k4[j]);
            }

            t += h;

            qExacta = solucionExacta(t, wd);
            error = Math.abs(qExacta - Y[0]);

            System.out.printf("%d\t %.2f\t %.6f\t %.6f\t %.6f\t %.6f%n", i+1, t, Y[0], Y[1], qExacta, error);
        }

        System.out.println("---------------------------------------------------------------------------");
    }
}