package Mod2;


import java.util.Arrays;
import java.util.Scanner;

/*
Дана последовательность целых чисел a1, a2,....an. Образовать новую
последовательность, выбросив из исходной  те члены, которые равны
min(a1, a2,....an)
-создать массив целых чисел
-найти минимальное среди массива:
-ввести переменную min и присвоить ей min[0] как первый элемент массива
-через цикл определить минимальное число
-определить длину нового массива
-заполнить новый массив
-вывести новый массив на экран без min


 */
public class Arrays8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int num = sc.nextInt();

        int[] mass = new int[num];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();
        }

        int min = mass[0];                     //нахождение минимального числа, за минимальное берем первый элемент
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println(" Min элемент массива = " + min);

        int counterLength = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > min) {
                counterLength++;
            }
        }
        System.out.println("Length of the new array: " + counterLength);
        int[] mass2 = new int[counterLength];

        int i2 = 0;                       //индекс нового массива, кот. будет заполнять новый массив
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != min) {
                mass2[i2] = mass[i];
                i2++;
            }
        }
        System.out.println("Последовательность элементов нового массива = ");
        for (int i = 0; i < mass2.length; i++) {
            System.out.println(mass2[i]);
        }

    }
}
