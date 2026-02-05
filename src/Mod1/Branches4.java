package Mod1;

import java.util.Scanner;

public class Branches4 {
    /*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
 */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите А = ");
        double a = sc.nextDouble();

        System.out.println("Введите B = ");
        double b = sc.nextDouble();

        System.out.println("Введите x, y, z");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println(verification(a, b, x, y, z));
    }

    public static boolean verification(double a, double b, int x, int y, int z) {

        if (a >= x && b >= y || a >= y && b >= x) {
            System.out.println("Кирпич проходит");
            return true;
        } else if (a >= x && b >= z || a >= z && b >= x) {
            System.out.println("Кирпич проходит");
            return true;
        } else if (a >= y && b >= z || a >= z && b >= y) {
            System.out.println("Кирпич проходит");
            return true;
        } else {
            System.out.println("Кирпич не проходит");
            return false;
        }
    }
}
