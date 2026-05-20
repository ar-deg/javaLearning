package Mod2;

import java.util.Scanner;

/*
Написать программу, определяющую сумму n- значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. ДЛя решения задачи использовать декомпозицию.
 */
public class Decomposition16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        int n = sc.nextInt();
        System.out.println(findSumNumbers(n));
        System.out.println(findEvenDigits(findSumNumbers(n)));

    }

    public static int findCounter(int number) {
        int counter = 0;
        while (number !=0) {
            int digit = number % 10;
            counter++;
            number = number / 10;
        }
        return counter;
    }

    public static boolean checkDigitQuant(int number, int n) {
        if (findCounter(number) == n) {
            return true;
        }
        return false;
    }

    public static boolean findOddDigits(int number) {
        while (number !=0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }

    public static int findEvenDigits(int number) {
        int counter = 0;
        while (number !=0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                counter++;
            }
            number = number / 10;
        }
        return counter;
    }

    public static int findSumNumbers(int n) {
        int i = (int) Math.pow(10, n - 1);
        int sum = 0;
        if (n !=0) {
            if (checkDigitQuant(i, n)) {
                for (; i < (int) Math.pow(10, n); i++) {
                    if (findOddDigits(i)) {
                        sum += i;
                    }
                }
            }
        }
        return sum;
    }
}


