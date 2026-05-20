package Mod3;

import java.util.Scanner;

/*
В строке вставить после каждого символа 'a' символ 'b'.
 */
public class ObjStr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово, содержащее букву а");
        String word = sc.nextLine();

        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += word.charAt(i);
            if (word.charAt(i) == 'a') {
                result += 'b';
            }
        }
        System.out.println("Полученное слово:" + result);
    }
}
