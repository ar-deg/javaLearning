package Mod3;

import java.util.Scanner;

/*
Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительынм
знаком. Определить количество предложений в строке X.
-сканер
-счетчик
-цикл, по которому проходимся при условии, если символ = '.', '!' или '?'.
 */
public class ObjStr10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = sc.nextLine();

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.' || string.charAt(i) == '!' || string.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("Кол-во предложений в строке =" + count);
    }
}
