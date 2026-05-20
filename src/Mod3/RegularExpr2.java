package Mod3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Извлечение всех чисел из строки
Написать метод  который находит и возвращает все целые числа из произвольного текста.
Например, "В корзине 3 яблока и 12 апельсинов" → ["3", "12"].
 */
public class RegularExpr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write something:");
        String text = sc.nextLine();

        Pattern number = Pattern.compile("[0-9]+");
        Matcher matcher = number.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
