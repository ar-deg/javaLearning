package Mod2;

/*
Сортировка вставками. Дана последовательность чисел a1, a2,...,an. Требуется переставить числа в порядке возрастания.
Делается это следующим образом. Пусть a1, a2,...,ai - упорядоченная последовательность, т.е a1<=a2<=...<=an.
Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая последовательность была тоже
возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. Примечание.
Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска. Двоичный поиск
оформить в виде отдельной функции.
-объявить массив
-запустить внешний цикл for, кот. начинается со 2 элемента
-ввести временную переменну для  текущего элемента
-создать отдельную функцию для бинарного поиска
-найти середину отсортированного массива и сравнить с текущим элементом
-показать результат бинарного поиска в основном методе
-сдвинуть элементы и вставить число current.
 */
public class SortArray5 {
    public static void main(String[] args) {
        int[] mass = {3, 6, 8, 5, 1, 4, 2, 12, 10, 9};
        int length = mass.length;
        for (int i = 1; i < length; i++) {
            int current = mass[i]; //текущий элемент
            int result = binarySearch(mass, current, 0, i - 1);
            for (int j = i - 1; j >= result; j--) {
                mass[j + 1] = mass[j];
            }
            mass[result] = current;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    public static int binarySearch(int[] arr, int current, int startIndex, int endIndex) {
        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;
            if (arr[mid] < current) {
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;
            }
        }
        return startIndex;
    }
}
