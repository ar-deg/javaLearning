package Mod2;

/*
Сформировать квадратную матрицу порядка n  по заданному образцу (n-четное):

1 1 1 1 1 1
0 1 1 1 1 0
0 0 1 1 0 0
0 1 1 1 1 0
1 1 1 1 1 1

 */
public class DoubleArrays6 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Длина массива " + n);

        int[][] matrice = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1 && j < i || n - i - 1 > n - j - 1 && i > n - j - 1) {
                    matrice[i][j] = 0;
                } else
                    matrice[i][j] = 1;
                System.out.print(matrice[i][j] + " ");

            }
            System.out.println();
        }
    }
}
