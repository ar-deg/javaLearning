package Mod3;

import java.util.Scanner;

/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было
введено "abc cde def", то должно быть выведено "abcdef".
-создание сканера для ввода символа
-через StringBuilder создать новую строку
-если индекс первого вхождения равен текущему индексу- добавление его
-replaceAll(" ", "")-удалить пробелы
 */
public class ObjStr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символы");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                sb.append(str.charAt(i));
            }
        }
        String result = sb.toString().replaceAll(" ", "");
        System.out.println(result);

    }
}
