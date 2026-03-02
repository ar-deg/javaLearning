package Mod2;

import java.util.Scanner;

/*
Вычислить площадь правильного шестиугольника со стороной a, используя метод вычисления площади треугольника
-ввод длины стороны через сканер
-создание доп. метода для нахождения площади равностороннего треугольника
-создание доп. метода для нахождения площади шестиугольника
-вывод значения площади шестиугольника в главный метод
 */
public class Decomposition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину стороны треугольника:");
        double a = sc.nextDouble();
        double areaTriangles = areaOfTriangle(a);
        double area = areaOfRegHexagon(areaTriangles);
        System.out.println("Площадь шестиугольника = " + area);

    }

    public static double areaOfTriangle(double a) {
        double areaTriangles = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        return areaTriangles;

    }

    public static double areaOfRegHexagon(double areaTriangles) {
        double area = 6 * areaTriangles;
        return area;
    }

}
