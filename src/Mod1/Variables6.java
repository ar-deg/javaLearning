package Mod1;

public class Variables6 {
    /*
     Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
     */
    public static void main(String[] args) {

        double x = (Math.random() * 4 - (-4) + (-4));
        double y = (Math.random() * 4 - (-3) + (-3));

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(dot(x, y));
    }

    public static boolean dot(double x, double y) {

        if (x >= 0 && x <= 4 && y >= 0 && y <= 4) {
            return true;
        }
        if (x <= 0 && x >= -2 && y >= 0 && y <= 4) {
            return true;
        }
        if (x >= 0 && x <= 4 && y <= 0 && y >= -3) {
            return true;
        }
        if (x <= 0 && x >= -4 && y <= 0 && y >= -3) {
            return true;
        }
        return false;
    }
}

