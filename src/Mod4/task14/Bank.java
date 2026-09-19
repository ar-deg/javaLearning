package Mod4.task14;

import Mod4.task13.City;

import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Client> clients;

    public Bank(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public int getTotalBalance(Client client) {
        int sum = 0;
        for (Account account : client.getAccounts()) {
            sum += account.getBalance();
        }
        return sum;
    }

    public int getTotalPositiveBalance(Client client) {
        int sum = 0;
        for (Account positiveAccount : client.getAccounts()) {
            if (positiveAccount.getBalance() > 0) {
                sum += positiveAccount.getBalance();
            }
        }
        return sum;
    }

    public int getTotalNegativeBalance(Client client) {
        int sum = 0;
        for (Account negativeAccount : client.getAccounts()) {
            if (negativeAccount.getBalance() < 0) {
                sum += negativeAccount.getBalance();
            }
        }
        return sum;
    }

    public Account findAccount(Client client, int numberOfAcc) {
        Account findAccount = null;
        for (Account account : client.getAccounts()) {
            if (account.getAccNumber() == numberOfAcc) {
                findAccount = account;
                break;
            }
        }
        if (findAccount == null) {
            System.out.println("Счет с номером " + numberOfAcc + " не найден");
        }
        return findAccount;
    }

    public void sortAccount(Client client) {
        client.getAccounts().sort(Comparator.comparing(Account::getBalance));
    }

    public void sortAcc(Client client) {
        client.getAccounts().sort(Comparator.comparing(Account::getAccNumber));
    }

}
