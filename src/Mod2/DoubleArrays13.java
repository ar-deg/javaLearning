package Mod2;
/*
Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */
public class DoubleArrays13 {
    public static void main(String[] args) {

        int line = 4;
        int column = 4;

        int[][] matrice = new int[line][column];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrice[i][j] = (int) (Math.random() * 10);
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Столбцы по возрастанию: ");
        int temp = 0;
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < line; i++) {
                for (int k = i + 1; k < line; k++) {
                    if (matrice[k][j] < matrice[i][j]) {
                        temp = matrice[k][j];
                        matrice[k][j] = matrice[i][j];
                        matrice[i][j] = temp;
                    }
                }
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Столбцы по убыванию: ");
        int temp1 = 0;
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < line; i++) {
                for (int k = i + 1; k < line; k++) {
                    if (matrice[k][j] > matrice[i][j]) {
                        temp1 = matrice[k][j];
                        matrice[k][j] = matrice[i][j];
                        matrice[i][j] = temp1;
                    }
                }
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
