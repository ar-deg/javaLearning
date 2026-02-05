package Mod2;

import java.util.Scanner;

/*
   Даны целые числа a[1], a[1], a[2]..... Вывести только те числа, для которых a[i]>i
-создание массива
-ввод элементов массива через цикл
-составление цикла для определения, есть ли числа, которые больше индекса.
При выполнении данной команды вывод на печать.
    */
public class Arrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int num = sc.nextInt();

        int[] mass = new int[num];

        System.out.println("Введите элементы массива");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > i) {
                System.out.println("Числа, для которых mass[i]>i: " + mass[i]);
            }
        }
    }
}
