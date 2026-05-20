package Mod2;

/*
Даны числа X,Y,Z,T -длины сторон четырехугольника. Написать метод вычисления его площади, если угол между сторонами
X и Y - прямой.
 */
public class Decomposition9 {
    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        double z = 5;
        double t = 6;

        double hypo = findHypo(x, y);
        double p = findSemiperimetr(z, t, hypo);
        double s1 = areaOfaRightTriangle(x, y);
        double s2 = areaofTriangle(z, t, p, hypo);
        double s3 = s1 + s2;

        System.out.println("Площадь прямоугольного треугольника равна" + " " + s1);
        System.out.println("Площадь произвольного треугольника равна " + " " + s2);
        System.out.println("Площадь четырехугольника равна" + " " + s3);

    }

    public static double areaOfaRightTriangle(double x, double y) {
        double area = (x * y) / 2;
        return area;
    }

    public static double findHypo(double x, double y) {
        double hypo = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return hypo;
    }

    public static double findSemiperimetr(double z, double t, double hypo) {
        double p = (z + t + hypo) / 2;
        return p;
    }

    public static double areaofTriangle(double z, double t, double p, double hypo) {
        double areaTriangle = Math.sqrt(p * (p - z) * (p - t) * (p - hypo));
        return areaTriangle;
    }

}
