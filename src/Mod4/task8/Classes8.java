package Mod4.task8;

/*
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Classes8 {
    public static void main(String[] args) {
        Customer[] customers = new Customer[4];
        customers[0] = new Customer(123, "Iv", "Tom", "Al", "vvv", 111, 23);
        customers[1] = new Customer(228, "Pa", "Max", "Vl", "cvv", 234, 45);
        customers[2] = new Customer(345, "Al", "Art", "Nk", "mat", 456, 89);
        customers[3] = new Customer(567, "Dm", "Fil", "Kr", "mal", 987, 39);

        DataCustomers dataCustomers = new DataCustomers(customers);
        System.out.println("Список всех покупателей:");
        dataCustomers.showCustomers();

        System.out.println();

        System.out.println("Список покупателей в алфавитном порядке:");
        dataCustomers.sortSurname();
        dataCustomers.showCustomers();

        System.out.println();

        System.out.println("Список покупателей с картами в заданном интервале:");
        dataCustomers.sortNumberOfCreditCard(100, 500);

    }
}
