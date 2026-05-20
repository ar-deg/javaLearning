package Mod4.task8;

public class DataCustomers {
    private Customer[] customers;

    public DataCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void sortSurname() {
        Customer temp;
        for (int i = 0; i < customers.length; i++) {
            for (int j = i + 1; j < customers.length; j++) {
                if (customers[i].getSurname().compareTo(customers[j].getSurname()) > 0) {
                    temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }
            }
        }
    }

    public void sortNumberOfCreditCard(int first, int last) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getNumberOfCreditCard() >= first && customers[i].getNumberOfCreditCard() <= last) {
                System.out.println(customers[i]);
            }

        }

    }

    public void showCustomers() {
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
    }
}
