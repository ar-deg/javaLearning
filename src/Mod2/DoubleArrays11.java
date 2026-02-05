package Mod2;

/*
Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5
встречается три и более раз
 */
public class DoubleArrays11 {
    public static void main(String[] args) {

        int line = 10;
        int column = 20;

        int[][] matrice = new int[10][20];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrice[i][j] = (int) (Math.random() * 16);
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < line; i++) {
            int count = 0;
            for (int j = 0; j < column; j++) {
                if (matrice[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println(" Число 5 встречается в строке " + (i + 1) + " - " + count + " раз"); // здесь все норм
            }
        }
    }
}
