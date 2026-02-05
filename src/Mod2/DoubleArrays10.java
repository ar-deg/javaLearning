package Mod2;

/*
найти положительные элементы главной диагонали квадратной матрицы
-инициализация переменных строки и столбца
-создание массива
-i==j - поиск главной диагонали
-условие, что элементы главной диагонали >0
 */
public class DoubleArrays10 {
    public static void main(String[] args) {

        int line = 4;
        int column = 4;

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
                if (i == j && matrice[i][j] > 0) {
                    System.out.print(matrice[i][j] + "\n");
                }
            }
            System.out.println();
        }
    }
}
