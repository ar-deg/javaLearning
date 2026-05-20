package Mod4.task8;

public class Customer {
    private int id;
    private String surname;
    private String firstName;
    private String patronymic;
    private String adress;
    private int numberOfCreditCard;
    private int numberOfBankAccount;

    public Customer(int id, String surname, String firstName, String patronymic, String adress, int numberOfCreditCard, int numberOfBankAccount) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.adress = adress;
        this.numberOfCreditCard = numberOfCreditCard;
        this.numberOfBankAccount = numberOfBankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public void setNumberOfCreditCard(int numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public int getNumberOfBankAccount() {
        return numberOfBankAccount;
    }

    public void setNumberOfBankAccount(int numberOfBankAccount) {
        this.numberOfBankAccount = numberOfBankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + adress + '\'' +
                ", numberOfCreditCard=" + numberOfCreditCard +
                ", numberOfBankAccount=" + numberOfBankAccount +
                '}';
    }
}
