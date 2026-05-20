package Mod3;

import java.util.Scanner;

/*
Напиcать метод который проверяет, что строка соответствует формату email:
латинские буквы/цифры/точки/дефисы, затем @, затем домен с точкой.
Например, user.name@example.com → true,  иначе→ false.
 */
public class RegularExpr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите email:");
        String email = sc.nextLine();
        System.out.println(email.matches("[a-zA-Z0-9.-]+[a-zA-Z0-9.-]+@[a-zA-Z]+\\.[a-z]{2,4}"));

    }
}
