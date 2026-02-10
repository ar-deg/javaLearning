package Mod2;
/*
Сформировать квадратную матрицу порядка n  по заданному образцу (n-четное):

1   1   1   1   1   1
2   2   2   2   2   0
3   3   3   3   0   0
n-1 n-1 0   0   0   0
n   0   0   0   0   0

квадратная матрица - число строк = числу столбцов
-инициализируем n
-инициализируем двумерный массив
-в цикле создадим условие, при котором j < n - i => matrice[i][j]= i+1 /заполняем строки
-выведем на экран
 */

public class DoubleArrays5 {
    public static void main(String[] args) {

        int n = 6;
        System.out.println(" Длина массива = " + n);

        int[][] matrice = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    matrice[i][j] = i + 1;
                }
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

    }
}
