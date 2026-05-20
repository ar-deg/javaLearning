package Mod2;

import java.util.Scanner;

/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234,
5789). Для решения задачи использовать декомпозицию.
 */
public class Decomposition15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        showArr(n);

    }

    public static boolean checkNum(int n) {
        if (n < 1) {
            return false;
        }
        return true;
    }

    public static int[] incNums(int number, int n) {
        int[] mass = new int[n];
        for (int i = mass.length - 1; i >= 0; i--) {
            if (number != 0) {
                mass[i] = number % 10;
                number = number / 10;

            }
        }
        return mass;
    }

    public static boolean findIncNums(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (i + 1 == mass.length) {
                break;
            }
            if (mass[i] >= mass[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int findLengthOfNewArr(int n) {
        int i = (int) Math.pow(10, n - 1);
        int counter = 0;
        for (; i < (int) Math.pow(10, n); i++) {
            if (findIncNums(incNums(i, n))) {
                counter++;
            }
        }
        return counter;
    }
    public static int[] findElementsOfNewArr(int n) {
        int i = (int) Math.pow(10, n - 1);
        int k = 0;
        int mass[] = new int[findLengthOfNewArr(n)];
        for(int j = 0; j< mass.length; j++){
            for (; i < (int) Math.pow(10, n); i++) {
                if (findIncNums(incNums(i, n))) {
                    mass[j] = i;
                    k = i;
                    break;
                }
            }
            k++;
            i=k;
        }
        return mass;
    }
    public static void showArr(int n){
        if(checkNum(n)){
            int mass[] = findElementsOfNewArr(n);
            for(int i = 0; i< mass.length; i++){
                System.out.println(mass[i]);
            }
        }
    }
}
