package Mod2;

import java.util.Scanner;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Decomposition11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = sc.nextInt();

        System.out.println("Введите второе число: ");
        int number2 = sc.nextInt();

        int counter1 = findArrLength(number1);
        System.out.println("В первом числе кол-во цифр: " + counter1);

        int counter2 = findArrLength(number2);
        System.out.println("Во втором  числе кол-во цифр: " + counter2);

        determineTheDiff(counter1, counter2);
    }

    public static int findArrLength(int number) {
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            count++;
            number = number / 10;
        }
        return count;
    }

    public static void determineTheDiff(int counter1, int counter2) {
        if (counter1 > counter2) {
            System.out.println("В первом числе цифр больше");
        } else if (counter2 > counter1) {
            System.out.println("Во втором числе цифр больше");
        } else {
            System.out.println("Равное кол-во цифр");
        }
    }
}
