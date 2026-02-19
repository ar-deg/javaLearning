package Mod2;
/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру
столбца.
 */

import java.util.Scanner;

public class DoubleArrays14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrice = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrice[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int j = 0; j < column; j++) {
            int count = 0;
            for (int i = 0; i < line; i++) {
                if (count == j) {
                    matrice[i][j] = 0;
                    System.out.println("1");
                }
                if (count < j) {
                    matrice[i][j] = 1;
                    System.out.println("2");
                }
                if (count > j) {
                    matrice[i][j] = 0;
                    System.out.println("3");
                }
                if (matrice[i][j] == 1) {
                    count++;
                    System.out.println("3");
                }
                //System.out.print(matrice[i][j] + " ");
            }
           // System.out.println();
        }
    }
}
