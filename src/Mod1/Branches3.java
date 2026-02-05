package Mod1;

import java.util.Scanner;

public class Branches3 {
    /*
     Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        if ((x1 - x2) / (x3 - x2) == (y1 - y2) / (y3 - y2)) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Не на одной прямой");
        }
    }
}
