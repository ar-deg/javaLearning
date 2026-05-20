package Mod3;

import java.util.Scanner;

/*
В строке найти количество цифр.
-создам массив символов
-создам счетчик
-пройдусь по массиву (если символ возвращает цифру, то счетчик ++)
 */
public class StringArr3 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = sc.nextLine();

        char[] symbol = string.toCharArray();
        int count = 0;
        for (int i = 0; i < symbol.length; i++) {
            if (Character.isDigit(symbol[i])) {
                count++;
            }
        }
        System.out.print("Количество цифр = " + count);



    }
}
