package Mod2;

import java.util.Scanner;

/*
В числовой матрице поменять два столбца любых столбца, т.е все элементы одного столбца поставить на соответствующие
им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
-инициализировать строку, столбец
-создать массив
-инициализировать номера столбцов
-ввести временную переменную
-вывести на экран
 */
public class DoubleArrays8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Введите длину строки");
        int line = sc.nextInt();
        System.out.println("Введите длину столбца ");
        int column = sc.nextInt();

        int[][] matrice = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrice[i][j] = (int) (Math.random() * 100);
                System.out.print(matrice[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println(" Введите номера столбцов");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int temporary = 0;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                temporary = matrice[i][num1];
                matrice[i][num1] = matrice[i][num2];
                matrice[i][num2] = temporary;
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
