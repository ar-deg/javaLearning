package Mod2;

/*
Задан массив D. Определить следующие суммы D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6]. Пояснение. Составить метод
(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
 */
public class Decomposition8 {
    public static void main(String[] args) {
        int[] D = {3, 6, 8, 4, 2, 9, 10, 7, 1};
        int sum1 = sumMass(D, 1, 3);
        System.out.println("Сумма первой последовательности = " + sum1);
        int sum2 = sumMass(D, 3, 5);
        System.out.println("Сумма второй последовательности = " + sum2);
        int sum3 = sumMass(D, 4, 6);
        System.out.println("Сумма третьей последовательности = " + sum3);

    }

    public static int sumMass(int[] mass, int k, int m) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += mass[i];
        }
        return sum;
    }
}
