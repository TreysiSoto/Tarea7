package Clase07;

import javax.swing.JOptionPane;

public class SumaMatriz {
    private int[][] matrizA;
    private int[][] matrizB;
    private int[][] matrizRes;

    public SumaMatriz() {
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas de las matrices"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas de las matrices"));
        this.matrizA = new int[filas][columnas];
        this.matrizB = new int[filas][columnas];
        this.matrizRes = new int[filas][columnas];
    }

    // metodo
    public void ingresarMatrizA() {
        System.out.println("Ingrese datos para Matriz A:");
        for (int filas = 0; filas < this.matrizA.length; filas++) {
            for (int columnas = 0; columnas < this.matrizA[filas].length; columnas++) {
                matrizA[filas][columnas] = Integer
                        .parseInt(JOptionPane.showInputDialog("Digite un número para la matriz A"));
                System.out.print(matrizA[filas][columnas] + " ");
            }
            System.out.println();
        }
    }

    public void ingresarMatrizB() {
        System.out.println("Ingrese datos para Matriz B:");
        for (int filas = 0; filas < this.matrizB.length; filas++) {
            for (int columnas = 0; columnas < this.matrizB[filas].length; columnas++) {
                matrizB[filas][columnas] = Integer
                        .parseInt(JOptionPane.showInputDialog("Digite un número para la matriz B"));
                System.out.print(matrizB[filas][columnas] + " ");
            }
            System.out.println();
        }
    }

    public void calcularSuma() {
        System.out.println("Suma de las dos matrices:");
        for (int filas = 0; filas < this.matrizRes.length; filas++) {
            for (int columnas = 0; columnas < this.matrizRes[filas].length; columnas++) {
                matrizRes[filas][columnas] = matrizA[filas][columnas] + matrizB[filas][columnas];
                System.out.print(matrizRes[filas][columnas] + " ");
            }
            System.out.println();
        }
    }

}
