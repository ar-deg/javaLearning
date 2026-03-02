package Mod2;

import java.util.Scanner;

/*
Написать метод (методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных
чисел: (НОК (А,В) = А * В / НОД (А, В))
-объявить две переменные через сканер
-создать доп. метод для нахождения НОД
-создать доп. метод для нахождения НОК
-в главном методе вывести на экран оба значения
 */

public class Decomposition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int number2 = sc.nextInt();

        System.out.println("НОД:" + findGreatestCommonDivisor(number1, number2));
        System.out.println("НОК:" + findLeastCommonMultiple(number1, number2));
    }

    public static int findGreatestCommonDivisor(int number1, int number2) {

        while (number1 != number2) {
            if (number1 > number2) {
                number1 = number1 - number2;
            }
            if (number2 > number1) {
                number2 = number2 - number1;
            }
        }
        return number1;
    }

    public static int findLeastCommonMultiple(int number1, int number2) {
        int result = 0;
        return result = (number1 * number2) / findGreatestCommonDivisor(number1, number2);
    }
}

