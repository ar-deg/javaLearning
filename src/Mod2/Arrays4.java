package Mod2;
/*
Даны действительные числа. Поменять местами наибольший и наименьший элементы
-создание массива с помощью сканера
-инициализация minIndex, maxIndex, temp
- создание цикла
-замена местами наиб и наим элементов с помощью индексов
 */

import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int num = sc.nextInt();

        double[] massiv = new double[num]; // num- numbers

        int indexMax = 0;
        int indexMin = 0;
        double temp = 0;        // temporary-временная

        System.out.println("Введите элементы массива");
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = sc.nextDouble();
        }

        double min = massiv[0];
        double max = massiv[0];

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > max) {
                max = massiv[i];
                indexMax = i;
            } else if (massiv[i] < min) {
                min = massiv[i];
                indexMin = i;
            }
        }
        System.out.println("Максимальное число = " + max);
        System.out.println("Индекс максимального числа = " + indexMax);

        System.out.println();

        System.out.println("Минимальное число = " + min);
        System.out.println("Индекс минимального числа = " + indexMin);

        System.out.println();

        temp = massiv[indexMin];
        massiv[indexMin] = massiv[indexMax];
        massiv[indexMax] = temp;

        System.out.println(indexMin + " : " + max);
        System.out.println(indexMax + " : " + min);
    }
}

