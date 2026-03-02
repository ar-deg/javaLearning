package Mod2;

import java.util.Scanner;

/*
Написать метод (методы) для нахождения НОД четырех натуральных чисел
-объявить четыре переменных через сканер
-создать доп. метод для нахождения НОД
-создать доп. метод для нахождения НОД 4-ех чисел:
-найти НОД для чисел 1,2 через вызов метода findGcd
-найти НОД для чисел 3,4 через вызов метода findGcd
-найти финальный НОД (1,2) и (3,4) через вызов метода findGcd
-в главном методе вывести на экран значение финального НОД
 */
public class Decomposition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int number1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int number2 = sc.nextInt();

        System.out.println("Введите третье число:");
        int number3 = sc.nextInt();

        System.out.println("Введите четвертое число:");
        int number4 = sc.nextInt();
        System.out.println("Наибольший общий делилеть четырех чисел:" + findFinalGcd(number1, number2, number3, number4));

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

    public static int findFinalGcd(int number1, int number2, int number3, int number4) {
        int gcd12 = findGcd(number1, number2);
        int gcd34 = findGcd(number3, number4);
        int finalGcd = findGcd(gcd12, gcd34);
        return finalGcd;
    }


}
