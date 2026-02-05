package Mod2;

import java.util.Scanner;

/*
 Дана матрица. Вывести к-ю строку и р-ый столбец матрицы
 -создать матрицу, для этого присвоить значения строкам и столбцам, через цикл вывести в консоль
 -инициализировать переменные num1 and num2 (номер строки и столбца)
 -вывести число, которое находится на пересечении данной строки и столбца
 */
public class DoubleArrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину строки и столбца:");
        int line = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrice = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrice[i][j] = (int) (Math.random() * 10);
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Введите номер строки и столбца:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println();

        int num3 = matrice[num1][num2];
        System.out.println(num3);

    }
}
