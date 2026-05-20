package Mod2;

import java.util.Scanner;

/*
Натуральное число, в записи котрого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n,
равна самому числу. Найти все числа от 1 до k. Для решения задачи использовать декомпозицию.
-создать доп. метод для нахождения кол-ва цифр в числе (это кол-во и будет степенью)
-проверка, является ли число- числом Армстронга  (вспомогательный метод)
-пройтись по циклу от  1 до k на соответствие чкритерию Армстронга
 */
public class Decomposition14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число k");
        int k = sc.nextInt();
        armstrongNum(k);
    }

    public static boolean checkNum(int num) {
        if (num <= 0) {
            return false;
        }
        return true;
    }

    public static int findCount(int number) {               //это и есть степень
        int count = 0;
        if (checkNum(number)) {
            while (number > 0) {
                int digit = number % 10;
                count++;
                number = number / 10;

            }
        }
        return count;
    }

    public static boolean isArmstrongNum(int number) {
        int sum = number;
        int digitSum = 0;
        int degree = findCount(number);
        int numberBuff = number;                  //временное хранилище, созраняем исходное число
        while (numberBuff > 0) {
            int digit = numberBuff % 10;
            numberBuff = numberBuff / 10;
            digitSum += (int) (Math.pow(digit, degree));
        }
        if (sum == digitSum) {
            return true;
        }
        return false;
    }

    public static void armstrongNum(int k) {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum = i;
            int digitSum = 0;
            if (isArmstrongNum(i)) {
                System.out.println(i);
            }
        }
    }
}
