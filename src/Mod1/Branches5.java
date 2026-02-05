package Mod1;

import java.util.Scanner;

public class Branches5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x = ");

        double x = sc.nextDouble();

        System.out.println("x =" + solving(x));
    }

    public static double solving(double x) {
        double result = 0;
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / Math.pow(x, 3) + 6;
        }
        return result;
    }
}
