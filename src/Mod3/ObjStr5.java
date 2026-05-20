package Mod3;

import java.util.Scanner;

/*
Подсчитать, сколько раз среди символов заданной строки встречается буква "a".
 */
public class ObjStr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = sc.nextLine();

        int count = 0;
        String word = s.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'а') {
                count++;
            }
        }
        System.out.println("Кол-во символов с буквой a:" + count);
    }
}
