package Mod3;

import java.util.Scanner;

/*
В строке найти количество чисел.
 */
public class StringArr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = sc.nextLine();

        String[] txt = string.split(" ");

        int count = 0;
        for (int i = 0; i < txt.length; i++) {
            String word = txt[i];
            if (Character.isDigit(word.charAt(i))) {
                count++;
            }

        }
        System.out.println("Количество чисел в строке = " + count);
    }
}
