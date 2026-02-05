package Mod2;

import java.util.Scanner;

/*
Дана последовательность действительных чисел a1, a2,....a.
Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */
public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько элементов будет в последовательности?");
        int elements = sc.nextInt();

        double[] sequenceOfNumbers = new double[elements];

        System.out.println("Введите " + elements + " элементов массива ");
        for (int i = 0; i < sequenceOfNumbers.length; i++) {
            sequenceOfNumbers[i] = sc.nextDouble();
        }

        System.out.println("Введите значение Z");
        double z = sc.nextDouble();

        int count = 0;

        for (int i = 0; i < sequenceOfNumbers.length; i++) {
            if (sequenceOfNumbers[i] > z) {
                sequenceOfNumbers[i] = z;
                count++;
            }
        }
        System.out.println("Количество замен = " + count);


    }
}
