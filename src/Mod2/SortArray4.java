package Mod2;

/*
Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=an. Требуется переставить числа в порядке возрастания.
Для этого сравниваются два соседних числа ai и ai+1. Если ai> ai+1, то делается перестановка. Так продолжается до тех
пор, пока все элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки, подсчитывая
при этом кол-ва перестановок.
 */
public class SortArray4 {
    public static void main(String[] args) {
        int[] mass = {2, 4, 9, 7, 5, 1, 3, 6, 8};
        int length = mass.length;
        System.out.println("Исходный массив:");
        for (int i = 0; i < length; i++) {
            System.out.print(mass[i] + " ");
        }
        int count = 0; //счетчик для подсчета замен
        for (int i = 0; i < length - 1; i++) { //кол-во проходов по массиву
            for (int j = 0; j < length - i - 1; j++) { //j проходится по парам
                if (mass[j] > mass[j + 1]) {
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Сортировка в порядке возрастания:");
        for (int i = 0; i < length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        System.out.print("Количество замен" + ": " + count);
    }
}

