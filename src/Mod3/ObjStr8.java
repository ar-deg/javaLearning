package Mod3;

import java.util.Scanner;

/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
Случай, когда самых длинных слов может быть несколько, не обрабатывать.
-через метод split разделить строку на части
-поиск максимума
 */
public class ObjStr8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String txt = sc.nextLine();

        int countMaxEl = 0;
        int countCurrentEl = 0;
        String stringMax = "";
        String[] words = txt.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > countCurrentEl) {
                countCurrentEl = word.length();
                stringMax = word;
            }
        }
        System.out.println(stringMax);

    }
}
