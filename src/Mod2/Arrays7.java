package Mod2;

import java.util.Scanner;

/*
Даны действительные числа a1, a2, a3.....an. Найти max(a1+a2n, a2+a2n-1,....,an+an+1)
-создаем массив действительных чисел(для этого нужно создать длину массива, ввести элементы массива)
-2n-общее кол-во чисел в последовательности, найти максимум среди этих n сумм
-т.е длина массива-это 2n.
-а максимум найти среди n сумм
-1. найти суммы n сумм(первого и последнего, второго и предпоследнего, среднего...)
-для такого нахождния воспользуемся формулой симметричных пар "mass[i] + mass[mass.length - 1 - i]"
-симметричные пары находим среди n сумм, для этого создаем доп. массив
-после находим максимальную сумму, берем за максимум первую сумму
 */
public class Arrays7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();

        double[] mass = new double[2 * n];
        double[] mass2 = new double[n];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextDouble();
        }
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = mass[i] + mass[mass.length - 1 - i]; //нахождение симметричных пар, уже в массиве 2
            System.out.println(mass2[i]);
        }
        double max = mass[0] + mass[mass.length - 1 - 0]; //нахождение максимальной суммы. Первая сумма как максимальная, после пойдет сравнение по массиву
        for (int i = 0; i < mass2.length; i++) {
            if (mass2[i] > max) {
                max = mass2[i];
            }
        }
        System.out.println("Max sum = " + max);
    }
}
