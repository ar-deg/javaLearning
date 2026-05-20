package Mod2;

import java.util.Scanner;

/*
Даны натуральные числа K и N. Написать метод(методы) формирования массива A, элементами которого являются числа,
сумма  цифр которых равна K и которые не больше N.
 */
public class Decomposition12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число K");
        int k = sc.nextInt();

        System.out.println("Введите число N");
        int n = sc.nextInt();

        int length = findNewArrLength(k, n);

        int[] arr = fillArr(k, n, length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    public static int findSumDig(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;   //сумма цифр какого-то числа
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public static int findNewArrLength(int k, int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (findSumDig(i) == k) {
                count++;
            }
        }
        return count;
    }

    public static int[] fillArr(int k, int n, int count) {
        int index = 0;
        int[] arr = new int[count];
        for (int i = 0; i <= n; i++) {
            if (findSumDig(i) == k) {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }
}
