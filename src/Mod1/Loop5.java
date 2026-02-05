package Mod1;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        double e = sc.nextDouble();

        System.out.println("Введите длину массива");
        int n = sc.nextInt();

        double mas[] = new double[n];
        double sum = 0;
        for (int i = 1; i < mas.length; i++) {
            mas[i] = (1 / (Math.pow(2, i)) + (1 / (Math.pow(3, i))));

            if (Math.abs(mas[i]) >= e) {
                sum += mas[i];
                System.out.println(i + ":" + " " + mas[i] + " ");
            }
        }
        System.out.println();
        System.out.println(sum);
    }

}
