package Mod2;

/*
Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=a3<=...<=an и b1<=b2<=b3<=...<=bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=b3<=...<=bn в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
-создание единого массива, который равен длине двух массивов
-заполнение massNew элементами  из первого массива;
-начиная со след. индекса, добавляем все элементы mass2
- с помощью сортировки пузырьком сортируем массив в порядке возрастания
 */
public class SortArray7 {
    public static void main(String[] args) {
        double[] mass1 = {1.1, 5.5, 3.3, 7.7, 9.9};
        double[] mass2 = {2.2, 6.6, 4.4, 8.8};

        double[] massNew = new double[mass1.length + mass2.length];
        for (int i = 0; i < mass1.length; i++) {
            massNew[i] = mass1[i];
        }
        for (int i = 0; i < mass2.length; i++) {
            massNew[mass1.length + i] = mass2[i];
        }

        int length = massNew.length;
        System.out.println("Исходный massNew:");
        for (int i = 0; i < length; i++) {
            System.out.print(massNew[i] + " ");
        }
        for (int i = 0; i < length - 1; i++) { //кол-во проходов по массиву
            for (int j = 0; j < length - i - 1; j++) { //j проходится по парам
                if (massNew[j] > massNew[j + 1]) {
                    double temp = massNew[j];
                    massNew[j] = massNew[j + 1];
                    massNew[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Сортировка в порядке возрастания:");
        for (int i = 0; i < length; i++) {
            System.out.print(massNew[i] + " ");
        }

    }
}
