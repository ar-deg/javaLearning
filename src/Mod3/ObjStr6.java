package Mod3;

import java.util.Scanner;

/*
Из заданной строки получить новую, повторив каждый символ дважды
-создать сканер для ввода слова
-через StringBuilder создать новую строку
-создать счетчик
-создать цикл в цикле (первый проходит по самому слову, второй добавляет символ)
 */
public class ObjStr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int count = 2;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < count; j++) {
                sb.append((s.charAt(i)));
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
