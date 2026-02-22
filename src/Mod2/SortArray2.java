package Mod2;

/*
Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm. Образовать из них новую последовательность чисел так,
чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
-в массив а добавим элементы массива b;
-при помощи сортировки образуем новую неубывающую последовательность.
 */
public class SortArray2 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 0, 0, 0, 0, 0};
        int[] b = {2, 4, 6, 8, 10};
        int k = 5;
        for (int i = 0; i < b.length; i++) {
            a[k + i] = b[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;

        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
