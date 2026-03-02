package Mod2;

/*
Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое
меньше максимального элемента массива, но больше всех других элементов)
-создать массив
-отсортировать его по возрастанию
-найти число, которое меньще максимального, но больше остальных
 */

public class Decomposition5 {
    public static void main(String[] args) {
        int[] mass = {1, 4, 6, 12, 8, 16};
        int[] sortArray = sortArray(mass);
        int secondMax = searchSecondMax(mass);
        System.out.println("Второе по величине максимальное число =" + searchSecondMax(mass));
    }

    public static int[] sortArray(int[] mass) {
        for (int i = 0; i < mass.length - 1; i++) { //кол-во проходов по массиву
            for (int j = 0; j < mass.length - i - 1; j++) { //j проходится по парам
                if (mass[j] > mass[j + 1]) {
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
        }
        return mass;
    }

    public static int searchSecondMax(int[] mass) {
        int maxSecond = mass[mass.length - 2];
        return maxSecond;
    }
}
