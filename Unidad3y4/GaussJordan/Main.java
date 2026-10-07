package Unidad3y4.GaussJordan;

public class Main {
    public static void main(String[] args) {
        double[][] matriz = DefMatriz.obtener();

        System.out.print("Matriz original:");
        DefMatriz.imprimirMatriz();

        GaussJordan.resolver(matriz);

        System.out.print("Matriz Identidad Reducida:");
        DefMatriz.imprimirMatriz();

        DefMatriz.imprimirResultado();
    }
}
