package Mod2;

/*
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Decomposition7 {
    public static void main(String[] args) {
        int firstNum = 1;
        int lastNum = 9;
        System.out.println("Сумма факториалов всех нечетных чисел = " + sumFactorial(firstNum, lastNum));
    }

    public static int getFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        //  System.out.println("Факториал числа" + " " + n + " " + "равен " + factorial);
        return factorial;
    }

    public static int sumFactorial(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            if (i % 2 != 0) {
                sum += getFactorial(i);
            }
        }
        return sum;
    }
}




