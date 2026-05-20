package Mod3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Парсинг даты из лога
Дана строка лога вида "[2025-04-03 14:30:05] ERROR: connection timeout".
Написать метод  который извлекает дату и время (2025-04-03 14:30:05) из квадратных скобок.
Если формат не найден — вернуть null.
 */
public class RegularExpr4 {
    public static void main(String[] args) {
        String text = "[2025-04-03 14:30:05] ERROR: connection timeout";
        Pattern date = Pattern.compile("(\\d{2,4})-(\\d{2})-(\\d{2}).\\d{2}:\\d{2}:\\d{2}");
        Matcher matcher = date.matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
        else {
            System.out.println("null");
        }

    }
}
//y-M-d.H.m.s