package Mod3;

import java.util.Scanner;

/*
Проверить, является ли заданное слово палиндромом.
-метод isPalindrome проверяет, явл. ли слово палиндромом
-String processed-создание новоц переменной, с кот. будем работать
-text.toLowerCase()-делаем все буквы прописными, чтобы не было ошибки при выводе, если слово написано с большой
-replaceAll("[^a-zа-я0-9]", "")-параметр, при котором будет выводиться все
-equals- сравнение строки по содержимому
 */
public class ObjStr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слово:");
        String word = sc.nextLine();

        boolean result = isPalindrome(word);
        System.out.println("Это слово является палиндромом?" + result);


    }

    /*public static boolean isPalindrome(String text) {
        String processed = text.toLowerCase().replaceAll("[^a-zа-я0-9]", "");

        String reversed = new StringBuilder(processed).reverse().toString();
        return processed.equals(reversed);  //буквы в строке идут в том же порядке, что и в reversed?

     */
    public static boolean isPalindrome(String word) {
        char[] chars = word.toCharArray();
        int left = 0; //индекс первого символа
        int right = chars.length - 1; //индекс последнего символа
        while (left < right) {   //пока не дошли до середины слова
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
        /*
        Сначала преобразуем с помощью метода toCharArray() исходную строку в массив символов,
        чтобы можно было обращаться к каждому отдельному символу по его порядковому индексу.
        Затем заводим две переменных left и right для хранения левого и правого индекса соответственно.
        После этого в цикле сравниваем левый и правый символы между собой до тех пор, пока левый индекс меньше правого.
         Если они окажутся равными или левый будет больше правого – они пересеклись.
        В самом цикле проверяем равенство левого и правого символа.
        Если они различны – сразу возвращаем false и выходим из метода.
        Далее левый символ увеличиваем на 1, а правый – уменьшаем на 1.
        Если мы дошли до середины строки и ни разу не встретили различий, то возвращаем true.
         */
