package Mod3;

/*
С помощью функции копирования и операции конкатенации из частей слова "информатика" получить слово "торт".
из слова "информатика" при помощи substring извлекаем подстроку
 */
public class ObjStr4 {
    public static void main(String[] args) {
        String word = "информатика";

        String t = word.substring(7, 8);
        String o = word.substring(3, 4);
        String r = word.substring(4, 5);

        String result = t + o + r + t;
        System.out.println(result);
    }
}
