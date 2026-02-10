package Mod2;

import java.util.Scanner;

/*
Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент
(освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

 */
public class Arrays10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int n = sc.nextInt();

        int[] mass = new int[n];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
            System.out.println(mass[i] + " ");

        }

    }

}

