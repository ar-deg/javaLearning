package Lessons;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(fac(4));

        // 4! = 4 * 3 * 2 * 1
    }

    private static int fac(int n) {
        if (n == 1)
            return 1;


        return n * fac(n - 1);
    }
}
