package Mod2;

/*
Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an. Требуется переставить элементы так, чтобы они были
расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое
место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется. Написать алгоритм
сортировки выбором.
 */
public class SortArray3 {
    public static void main(String[] args) {
        int[] mass = {3, 5, 1, 7, 8, 2, 4, 9, 6, 10, 15, 13, 11, 19, 20, 14, 12};
        int length = mass.length;

        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (mass[maxIndex] < mass[j]) {
                    maxIndex = j;
                }
            }
            int temp = mass[maxIndex];
            mass[maxIndex] = mass[i];
            mass[i] = temp;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
