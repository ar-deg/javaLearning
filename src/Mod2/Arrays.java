package Mod2;
/*
 В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K.
 */

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Введите элементы массива");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Введите число K");
        int k = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }

        }
        System.out.println();
        System.out.println("Сумма элементов, кратных" + " " + k + " " + "," + "равна" + " " + sum);

        sc.close();
    }
}
