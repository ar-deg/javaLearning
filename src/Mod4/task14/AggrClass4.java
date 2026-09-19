package Mod4.task14;

import java.util.ArrayList;
import java.util.List;

/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление  общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
положительный и отрицательный балансы отдельно.
 */
public class AggrClass4 {
    public static void main(String[] args) {
        Account account1 = new Account(728776, 1500);
        Account account2 = new Account(567459, 450);
        Account account3 = new Account(209265, 800);
        Account account4 = new Account(975467, 900);
        Account account5 = new Account(645831, -450);

        List<Account> accountsIvan = new ArrayList<>();
        accountsIvan.add(account1);
        accountsIvan.add(account3);

        List<Account> accountsArtem = new ArrayList<>();
        accountsArtem.add(account2);
        accountsArtem.add(account4);

        List<Account> accountsPavel = new ArrayList<>();
        accountsPavel.add(account5);


        Client client1 = new Client("Ivan", "Ivanov", 456, accountsIvan);
        Client client2 = new Client("Artem", "Fedorov", 228, accountsArtem);
        Client client3 = new Client("Pavel", "Vasnecov", 777, accountsPavel);

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        Bank bank = new Bank(clients);

        System.out.println("Просмотр счетов Ивана:");
        System.out.println("Счета до сортировки:");
        System.out.println(client1.getAccounts());

        System.out.println();

        bank.sortAcc(client1);
        System.out.println("Счета после сортировки по номеру:");
        System.out.println(client1.getAccounts());

        System.out.println();

        bank.sortAccount(client1);
        System.out.println("Счета после сортировки по балансу:");
        System.out.println(client1.getAccounts());

        System.out.println();

        System.out.println("Проверка поиска счета:");
        Account find = bank.findAccount(client1, 728776);
        System.out.println("Найденный счет: " + find);

        System.out.println();

        System.out.println("Общий баланс счета:");
        int sum = bank.getTotalBalance(client1);
        System.out.println("Баланс: " + sum);

        System.out.println();

        System.out.println("Баланс по положительным счетам:");
        int sum1 = bank.getTotalPositiveBalance(client1);
        System.out.println("Баланс: " + sum1);

        System.out.println();

        System.out.println("Баланс по отрицательным счетам:");
        int sum2 = bank.getTotalNegativeBalance(client1);
        System.out.println("Баланс: " + sum2);

        System.out.println();

        System.out.println("Проверка блокировки счета:");
        account1.block();
        System.out.println("Счета после блокировки одного из:");
        System.out.println(client1.getAccounts());

        System.out.println();

        System.out.println("Проверка разблокировки счета:");
        account1.unblock();
        System.out.println("Счета после разблокировки одного из:");
        System.out.println(client1.getAccounts());

        System.out.println();
        /// ////////////////////////////////////////
        System.out.println("Просмотр счетов Павла:");

        System.out.println("Проверка поиска счета:");
        Account find1 = bank.findAccount(client3, 2345);
        System.out.println();

        System.out.println("Общий баланс счета:");
        int sum3 = bank.getTotalBalance(client3);
        System.out.println("Баланс: " + sum3);

        System.out.println();

        System.out.println("Баланс по положительным счетам:");
        int sum4 = bank.getTotalPositiveBalance(client3);
        System.out.println("Баланс: " + sum4);

        System.out.println();

        System.out.println("Баланс по отрицательным счетам:");
        int sum5 = bank.getTotalNegativeBalance(client3);
        System.out.println("Баланс: " + sum5);


    }
}
