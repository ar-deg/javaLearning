package Mod2;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив,
включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив.
-создаем единый массив, который равен длине двух массивов
-заполним massNew элементами  из первого массива до k (не включая)
-начиная с k, добавляем все элементы mass2
-чтобы остаток mass1 добавить в massNew, нужно найти место для k+1, т.е в massNew предоставить ячейку [i+mass2.length]
 */
public class SortArray1 {
    public static void main(String[] args) {
        int[] mass1 = {1, 2, 3, 4, 5, 6, 12, 15, 7};
        int[] mass2 = {8, 9, 10, 11};
        int k = 5;
        int[] massNew = new int[mass1.length + mass2.length]; //длина общего массива
        for (int i = 0; i < k; i++) {
            massNew[i] = mass1[i];  //заполнили общий массив элементами первого массива до k
        }
        for (int i = 0; i < mass2.length; i++) {
            massNew[k + i] = mass2[i];    //добавили массив2
        }
        for (int i = k; i < mass1.length; i++) {
            //здесь нужно остаток mass1 поместить в хвост massNew
            massNew[i + mass2.length] = mass1[i];
        }
        for (int i = 0; i < massNew.length; i++) {
            System.out.print(massNew[i] + " ");

        }
    }
}
