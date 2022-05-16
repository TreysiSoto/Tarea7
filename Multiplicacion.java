package Clase007;

import javax.swing.JOptionPane;

public class MultMatriz {
    private int fila1;
    private int columna1;

    private int fila2;
    private int columna2;

    private int valores1;
    private int valores2;

    private int mat1[][];
    private int mat2[][];
    private int multiplicacion[][];

    public MultMatriz() {

        fila1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila para la matriz 1"));

        columna1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna para la matriz 1"));

        this.mat1 = new int[fila1][columna1];

        fila2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila para la matriz 2"));

        columna2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna para la matriz 2"));

        this.mat2 = new int[fila2][columna2];

        multiplicacion = new int[fila2][columna2];

    }

    public void agregarMatriz1() {
        for (int fila1 = 0; fila1 < this.mat1.length; fila1++) {
            for (int columna1 = 0; columna1 < this.mat1[fila1].length; columna1++) {
                this.valores1 = Integer.parseInt(JOptionPane.showInputDialog("valores para la matriz 1"));

                this.mat1[fila1][columna1] = this.valores1;
            }
        }
    }
    public void agregarMatriz2() {
        for (int fila2 = 0; fila2 < this.mat2.length; fila2++) {
            for (int columna2 = 0; columna2 < this.mat2[fila2].length; columna2++) {
                this.valores2 = Integer.parseInt(JOptionPane.showInputDialog("valores para la matriz 2"));

                this.mat2[fila2][columna2] = this.valores2;
            }
        }
    }
    public void calcularMultiplicacion() {
        System.out.println("resultado");
        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < columna2; j++) {
                for (int k = 0; k < columna1; k++) {
                    multiplicacion[i][j] += mat1[i][k] * mat2[k][j];
                }
                System.out.printf("%d  ", multiplicacion[i][j]);
            }
            System.out.println();
        }
    }
}
