package Mod2;

import java.util.Scanner;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов  в каждом столбце. Определить, какой столбец содержит
максимальную сумму
 */
public class DoubleArrays9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину строки и столбца");
        int line = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrice = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrice[i][j] = (int) (Math.random() * 100);
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < line; i++) {
            int sumOfElements = 0;
            for (int j = 0; j < column; j++) {
                sumOfElements += matrice[j][i];
            }
            System.out.println("Сумма элементов столбца " + (i + 1) + " : " + sumOfElements);
        }
    }
}

