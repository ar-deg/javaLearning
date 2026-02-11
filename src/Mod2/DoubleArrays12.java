package Mod2;

/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов
-выведем матрицу на экран для просмотра
-введем временную переменную для промежуточного значения
-создадим внутренний цикл k для сравнени текущего элемента с последующими
-условие: если последующий элемент меньше текущего элемента => меняем местами, чтобы меньший элемент стал в начало
-то же самое для убывания, только последующий элемент больше текущего.
 */
public class DoubleArrays12 {
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
        System.out.println("Строки по возрастанию: ");
        int temp = 0;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = j + 1; k < column; k++) {
                    if (matrice[i][k] < matrice[i][j]) {
                        temp = matrice[i][k];
                        matrice[i][k] = matrice[i][j];
                        matrice[i][j] = temp;
                    }
                }
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Строки по убыванию: ");
        int temp1 = 0;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = j + 1; k < column; k++) {
                    if (matrice[i][k] > matrice[i][j]) {
                        temp = matrice[i][k];
                        matrice[i][k] = matrice[i][j];
                        matrice[i][j] = temp;
                    }
                }
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
