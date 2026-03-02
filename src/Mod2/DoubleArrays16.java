package Mod2;

/*
Магическим квадратом порядка n называется квадратная матрица размером n x n, составленная из чисел 1, 2, 3, ...n^2 так,
что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой
квадрат. Пример магического квадрата порядка 3:
6 1 8
7 5 3
2 9 4

 */

public class DoubleArrays16 {
    public static void main(String[] args) {

        int n = 3;
        int[][] matrice = new int[n][n];
        int indexI = 0;
        int indexJ = n / 2;
        for (int num = 1; num <= n * n; num++) {
            matrice[indexI][indexJ] = num;
            //System.out.println("1. число"+ num+"в ячейке"+matrice[indexI][indexJ]);
            int tempI = indexI;
            int tempJ = indexJ;
            indexI--;      //уменьшаем значение i на 1 (шаг вверх)
            //если значение indexI меньше нуля, то прибавляем к переменной indexI число, равное размеру матрицы
            if (indexI < 0) {
                indexI += n;
                System.out.println("2.Вылет вверх за предел, переход на строку" + indexI);
            }
            indexJ--;
            if (indexJ < 0) {
                indexJ += n;     //example: -1+3=2
                System.out.println("3.Вылет влево, переход в столбец" + indexJ);
            }
            //если число в ячейке не равно 0
            if (matrice[indexI][indexJ] != 0) {
                //то к переменной tempI прибавляется 1 и сохраняется в переменной indexI
                indexI = tempI + 1; //шаг вниз от предыдущего числа
                System.out.println("5.Шаг вниз" + indexI);
                //если переменная indexI равна размеру матрицы
                if (indexI == n) {
                    indexI = 0; //идем в начало строки
                    System.out.println("6");
                }
                // indexJ приравнивается к значению tempJ, т.е "адресу" последнего числа
                indexJ = tempJ;

            }
        }
        /*
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

         */


    }
}


