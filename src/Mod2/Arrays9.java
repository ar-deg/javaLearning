package Mod2;

import java.util.Scanner;
/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то
определить наименьшее из них.
-задать длину массива
-создать массив
-заполнить рандомными числами
-
 */

public class Arrays9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] mass = new int[n];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);
        }

        int repeatedNumber = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (repeatedNumber > mass[i]) {
                mass[i] = repeatedNumber;
            }
        }
    }
}
