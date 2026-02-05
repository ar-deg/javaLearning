package Mod2;

import java.util.Scanner;

public class DoubleArrays1 {
    /*
    Дана матрица. Вывести на экран все нечетнеы столбцы, у которых первый элемент больше последнего.
    -создать матрицу, для этого присвоить значения строкам и столбцам, через цикл вывести в консоль
    -пройтись по след. циклу, в котором проверить нечетность и сравнить первый элемент с последним
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину строки ");
        int line = sc.nextInt();
        System.out.println("Ввелите длину столбца ");
        int column = sc.nextInt();

        int[][] matrice = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrice[i][j] = (int) (Math.random() * 100);
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (j % 2 != 0) {
                    if (matrice[0][j] > matrice[line - 1][j]) ;
                    System.out.print(matrice[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

}
