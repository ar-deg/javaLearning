package Mod2;

import java.util.Scanner;

/* Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем положительных,
отрицательных и нулевых элементов.
 */
public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько элементов будет в последовательности?");
        int n = sc.nextInt();

        double[] arrays = new double[n];

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        System.out.println("Введите элементы массива: положительные, отрицательные, нулевые");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = sc.nextDouble();
            if (arrays[i] > 0) {
                countPositive++;
            } else if (arrays[i] < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println("Положительных элементов в массиве = " + countPositive);
        System.out.println("Отрицательных элементов в массиве = " + countNegative);
        System.out.println("Нулевых элементов в массиве = " + countZero);


    }
}
