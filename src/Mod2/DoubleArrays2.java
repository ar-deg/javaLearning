package Mod2;
/*
Дана матрица. Вывести на экран элементы, стоящие на диагонали
-инициализация переменных строки и столбца
-создание массива
-i==j - поиск левой диагонали/ главной
- i+j==длина массива-1 -поиск правой диагонали
 */
public class DoubleArrays2 {
    public static void main(String[] args) {

        int line = 3;
        int column = 3;

        int[][] matrice = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrice[i][j] = (int) (Math.random() * 10);
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    System.out.print(matrice[i][j] + "\n");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (i + j == line - 1) {
                    System.out.print(matrice[i][j] + "\n");
                }
            }
            System.out.println();
        }

    }
}
