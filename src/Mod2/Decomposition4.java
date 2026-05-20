package Mod2;

/*
На плоскости заданы своими координатами  n точек. Написать метод(методы), определяющие, между какими из пар точек
самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class Decomposition4 {
    public static void main(String[] args) {
        Point a = new Point(1, 4);
        Point b = new Point(2, 6);
        Point c = new Point(3, 8);
        Point d = new Point(4, 10);

        Point[] mass = {a, b, c, d};
        findMaxDistance(mass);
    }

    public static double findMaxDistance(Point[] mass) {
        double maxDist = 0;
        int startIndex = 0;
        int endIndex = 0;
        double counterCurrentDistance = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                counterCurrentDistance = Point.calculateDistanceBetweenPoints(mass[i], mass[j]);
                if (counterCurrentDistance > maxDist) {
                    maxDist = counterCurrentDistance;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }
        System.out.println("Максимальное расстояние" + " " + maxDist + " " + "между точками" + " " + startIndex + " " + "и" + " " + " " + endIndex);
        return maxDist;
    }
}

class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double calculateDistanceBetweenPoints(Point first, Point second) {
        return Math.sqrt((second.y - first.y) * (second.y - first.y) + (second.x - first.x) * (second.x - first.x));
    }
}
