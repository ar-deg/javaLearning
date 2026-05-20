package Mod3;

import java.util.Scanner;

/*
Дан текст (строка). Найдите наибольшее кол-во пордяд идущих пробелов в нем.
 */
public class ObjStr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String s = sc.nextLine();

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Наибольшее кол-во пробелов подряд = " + maxCount);
    }
}
