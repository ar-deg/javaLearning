package Mod2;

import java.util.Scanner;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера
которых являются простыми числами.
простое число - это натуральное число больше 1, которое делится на 1 и на себя.
-создать массив
-ввести элементы массива через цикл
-найти простые числа (по индексу), для нахождения простого числа создаем доп. метод
-вычислить сумму чисел типа double, у которых порядковый номер  = простому числу
 */
public class Arrays6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int n = sc.nextInt();

        double[] mass = new double[n];
        double sum = 0;

        System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++) {
            mass[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i + " : " + mass[i]);  //каждому индексу соотв. опред. элемент массива
        }
        for (int i = 0; i < n; i++) {    //находим сумму простых чисел из метода isSimple
            if (isSimple(i)) {
                sum += mass[i];
            }
        }
        System.out.println(sum);
    }

    public static boolean isSimple(int i) {   //определение, является ли число простым, по индексу
        if (i < 2) {
            return false; // число не простое
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {   //вводим доп. переменную, как делитель числа
            if (i % j == 0) {
                return false; // число не простое
            }
        }
        return true;
    }
}
