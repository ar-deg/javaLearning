package Mod2;

import java.util.Scanner;

/*
Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми
-объявить три переменных через сканер
-найти НОД (создание доп. метода)
-НОД принять за 1 (доп. метод, который проверяет данное условие)
-проверка, являются ли три числа взаимно простыми (проверка условия в главном методе)
 */
public class Decomposition6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();

        System.out.println("Введите третье число:");
        int num3 = sc.nextInt();

        int finalGsd = findFinalGcd(num1, num2, num3);
        System.out.println("НОД = " + finalGsd);

        if (coprimeNumbers(finalGsd)) {
            System.out.println("Числа являются  взаимно простыми");
        } else {
            System.out.println("Не являются взаимно простыми");
        }


    }

    public static int findGcd(int a, int b) {
        int gcd;
        while (b != 0) {
            gcd = a % b;
            a = b;
            b = gcd;
        }
        return a;
    }

    public static boolean coprimeNumbers(int gcd) {
        if (gcd == 1) {
            return true;
        }
        return false;
    }

    public static int findFinalGcd(int num1, int num2, int num3) {
        int gcd12 = findGcd(num1, num2);
        int finalGcd = findGcd(gcd12, num3);
        return finalGcd;
    }

}
