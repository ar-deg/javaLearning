package Mod2;
/*
Найдите наибольший элемент матрицы и заменить все нечетые элементы на него.
-создать матрицу
-пусть наибольший элемент = первому элементу матрицы
-если matrice[i][j] % 2 != 0, меняем matrice[i][j] на max
 */

public class DoubleArrays15 {
    public static void main(String[] args) {

        int line = 4;
        int column = 4;

        int[][] matrice = new int[line][column];
        System.out.println("Исходная матрица:");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrice[i][j] = (int) (Math.random() * 10);
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int max = matrice[0][0];   //пусть первое число будет наиб.
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (matrice[i][j] > max) {
                    max = matrice[i][j];
                }
            }
        }
        System.out.println("Наибольшее число:" + " " + max);
        System.out.println();

        System.out.println("Матрица после замены:");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (matrice[i][j] % 2 != 0) {
                    matrice[i][j] = max;
                }
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}

