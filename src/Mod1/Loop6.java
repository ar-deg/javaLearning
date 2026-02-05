package Mod1;

import java.util.Scanner;
/*Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

 */
public class Loop6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            System.out.println(i + " : " + (int)ch);
        }
    }
}
