package Mod4.task4;

import java.util.Scanner;

/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
быть упорядочены по времени отправления.
 */
public class Classes4 {
    public static void main(String[] args) {
        Train train[] = new Train[5];
        train[0] = new Train("Brest", 1, "07:55");
        train[1] = new Train("Gomel", 5, "08:20");
        train[2] = new Train("Grodno", 9, "08:55");
        train[3] = new Train("Mogilev", 6, "09:30");
        train[4] = new Train("Gomel", 2, "10:10");


        System.out.println("Сортировка номеров поездов:");
        sortTrainNumber(train);
        for (int i = 0; i < train.length; i++) {
            System.out.println(train[i]);
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер поезда");
        int trainNumber = sc.nextInt();
        for (int i = 0; i < train.length; i++) {
            if (train[i].getTrainNumber() == trainNumber) {
                System.out.println(train[i]);
            }
        }
        System.out.println();

        System.out.println("Сортировка поездов по пункту назначения:");
        sortNameOfDestination(train);
        for (int i = 0; i < train.length; i++) {
            System.out.println(train[i]);
        }

    }

    public static Train[] sortTrainNumber(Train train[]) {
        Train temp;
        for (int i = 0; i < train.length; i++) {
            for (int j = i + 1; j < train.length; j++) {
                if (train[i].getTrainNumber() > train[j].getTrainNumber()) {
                    temp = train[i];
                    train[i] = train[j];
                    train[j] = temp;
                }
            }
        }
        return train;
    }

    public static Train[] sortNameOfDestination(Train train[]) {
        Train temp;
        for (int i = 0; i < train.length; i++) {
            for (int j = i + 1; j < train.length; j++) {
                if (train[i].getNameOfDestination().compareTo(train[j].getNameOfDestination()) > 0) {
                    temp = train[i];
                    train[i] = train[j];
                    train[j] = temp;
                } else if (train[i].getNameOfDestination().compareTo(train[j].getNameOfDestination()) == 0) {
                    if (train[i].getDepartureTime().compareTo(train[j].getDepartureTime()) > 0) {
                        temp = train[i];
                        train[i] = train[j];
                        train[j] = temp;
                    }
                }
            }
        }
        return train;
    }


}
