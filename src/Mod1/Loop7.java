package Mod1;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.

 */
public class Loop7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите m =");
        int m = sc.nextInt();
        System.out.println("Введите n =");
        int n = sc.nextInt();

        var(m, n);
        System.out.println();
    }

    public static void var(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.println(i + ":");

            for (int div = 1; div < n; div++) {

                if (i % div == 0 && div != 1 && div != i) {
                    System.out.println(div + " ");
                }

            }

            System.out.println();
        }
    }
}
