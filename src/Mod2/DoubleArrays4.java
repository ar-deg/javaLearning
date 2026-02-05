package Mod2;

/*
Сформировать квадратную матрицу порядка n по заданному образцу (n-четное)
   1  2  3  ...  n
   n n-1 n-2 ... 1
   1  2  3  ...  n
   n n-1 n-2 ... 1
   1  2   3  ... n
   n n-1 n-2 ... 1
-инициализируем n
-инициализируем двумерный массив
-в цикле создадим условие, при котором четные строки = j+1/ нечетные n-j
-выведем на экран
 */
public class DoubleArrays4 {
    public static void main(String[] args) {

        int n = 4;
        System.out.println("Длина массива =" + n);

        int[][] matrice = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    matrice[i][j] = j + 1;
                } else
                    matrice[i][j] = n - j;
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

    }
}

