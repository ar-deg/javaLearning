package Mod3;

import java.util.Scanner;

/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только
английские буквы.
-сканер
-счетчики для больших и маленьких букв
-цикл, по которому будем проходиться для поиска больших и маленьких букв
-применение кодировки символов для больших и маленьких английских букв
 */
public class ObjStr9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();

        int countUpper = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {
                if (Character.isUpperCase(str.charAt(i))) {
                    countUpper++;
                }
            }
        }

        int countLower = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) {
                if (Character.isLowerCase(str.charAt(i))) {
                    countLower++;
                }
            }
        }

        System.out.println("Кол-во строчных букв = " + countLower);
        System.out.println("Кол-во прописных букв = " + countUpper);
    }
}
