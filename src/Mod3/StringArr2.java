package Mod3;

import java.util.Scanner;

/*
Замените в строке все вхождения 'word' на 'letter'.
-разделить строку по пробелам с помощью split
-пройтись по каждому в цикле
-сравнить каждое со словом word, заменить на letter
-вывести на экран
 */
public class StringArr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку, в составе которой есть слово 'word'");
        String string = sc.nextLine();

        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("word")) {
                words[i] = "letter";
            }
            System.out.print(words[i] + " ");
        }
    }
}
