package Mod3;

import java.util.Scanner;

/*
Замена нескольких пробелов на один
Написать метод который заменяет любые последовательности из двух и более пробелов на один.
Например, "Hello    world   !" → "Hello world !".
 */
public class RegularExpr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write something");
        String text = sc.nextLine();

        System.out.println(text.replaceAll("\s+", "\s"));

    }
}
