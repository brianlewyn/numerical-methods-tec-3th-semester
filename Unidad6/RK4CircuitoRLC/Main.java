package Unidad6.RK4CircuitoRLC;

public class Main {
    public static void main(String[] args) {
        int nPuntos = 25;
        double h = 0.2;      // Variar: 0.2, 0.1, 0.05
        double t0 = 0.0;
        double[] Y = {1.0, 0.0};   // q(0)=1.0, q'(0)=0.0

        RK4CircuitoRLC.resolver(nPuntos, h, t0, Y);
    }
}