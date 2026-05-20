package Mod2;

import java.util.Scanner;

/*
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */
public class Decomposition10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int num = sc.nextInt();


        int length = findMassLength(num);
        System.out.println("Кол-во элементов массива = " + length);

        System.out.println();

        System.out.println("Элементы массива:");
        int[] mass = addElements(num, length);
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    public static int findMassLength(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    public static int[] addElements(int num, int massLength) {
        int[] mass = new int[massLength];
        while (num > 0) {
            for (int i = mass.length - 1; i >= 0; i--) {
                int digit = num % 10;
                mass[i] = digit;
                num = num / 10;
            }
        }
        return mass;
    }
}
