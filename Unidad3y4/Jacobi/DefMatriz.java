package Unidad3y4.Jacobi;

public class DefMatriz {    
    
    public static double[][] obtenerMatrizA() {
        return new double[][] {
            { 4.0, -1.0,  0.0},
            {-1.0,  4.0, -1.0},
            { 0.0, -1.0,  4.0},
        };
    }

    public static double[] obtenerVectorB() {
        return new double[] { 2.0, 1.0, 3.0 };
    }

    public static double[] obtenerVectorX0() {
        return new double[] { 0.0, 0.0, 0.0 };
    }

}