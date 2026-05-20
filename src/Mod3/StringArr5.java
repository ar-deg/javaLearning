package Mod3;

import java.util.Scanner;

/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */
public class StringArr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = sc.nextLine();

        String sentence = string.trim();
        String[] words = sentence.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);


    }
}
