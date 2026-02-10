package Mod2;


import java.util.Scanner;
/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то
определить наименьшее из них.
-задать длину массива
-создать массив
-заполнить рандомными числами
-введем переменную repeatedNumber, пусть первое число будет самым частым
-введем переменную maxCount как счетчик максимального кол-ва повторений.
-в цикл добавим дополнительный цикл, кот. поможет сравнить текущее число mass[i] с каждым элементом в массиве mass[j]
 и подсчитать кол-во повторений.
 -если число встретилось n раз => часто встречающееся
 -если есть несколько часто встречающихся, то меньшее = как само число < повторяющегося
 */

public class Arrays9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int n = sc.nextInt();

        int[] mass = new int[n];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10);
            System.out.println(mass[i] + " ");
        }
        System.out.println();

        int repeatedNumber = mass[0];
        int maxCount = 0;

        for (int i = 0; i < mass.length; i++) {
            int count = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                repeatedNumber = mass[i];
            }
        }
        System.out.println("Наиболее часто встречающееся число" + ":" + repeatedNumber);
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            int count = 0;
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] == mass[j]) {
                    count++;
                }
            }
            if (mass[i] < repeatedNumber) {
                repeatedNumber = mass[i];
            }
        }
        System.out.println("Наименьшее часто встречающееся число" + ":" + repeatedNumber);
    }
}
