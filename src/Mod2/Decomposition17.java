package Mod2;

import java.util.Scanner;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Склько таких действий
надо произвести, чтобы получился нуль? ДЛя решения задачи  использовать декомпозицию.
-найти сумму цифр числа
-при помощи счетчика просчитаем кол-во действий ( +в цикле просчитать действие вычитания)
 */
public class Decomposition17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        System.out.println("Кол-во действий = " + findQuantityOfTrying(number));

    }

    public static int sumOfDig(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }

    public static int findQuantityOfTrying(int number) {
        int counter = 0;
        while (number > 0) {
            number = number - sumOfDig(number);
            counter++;
        }
        return counter;
    }

}
