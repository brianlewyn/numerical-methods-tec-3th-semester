package Unidad3y4.GaussJordan;

public class DefMatriz {
    private static double[][] matriz = new double[][] { 
        { 3.0, -0.1, -0.2,   7.85 }, 
        { 0.1,  7.0, -0.3, -19.3 }, 
        { 0.3, -0.2, 10.0,  71.4 },
    };
    
    public static double[][] obtener() {
        return matriz;
    }

    public static void imprimirMatriz() {
        System.out.println();
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            
            for (int j = 0; j < matriz[i].length-1; j++) {
                System.out.printf("%6.2f ", matriz[i][j]);
            }
            
            System.out.printf("| %6.2f |\n", matriz[i][matriz[i].length-1]);
        }
        
        System.out.println();
    }

    public static void imprimirResultado() {
        System.out.print("Solución: ");

        int n = matriz[0].length;

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf(" x%d = %.2f ", i+1, matriz[i][n-1]);
        }
        
        System.out.println();
    }
}
