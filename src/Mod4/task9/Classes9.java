package Mod4.task9;

/*
Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и  get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, кол-во страниц, цена, тип переплета.
Найти и вывести:
а) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
public class Classes9 {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book(123, "Story1", "Author1", "III", 1965, 345, 22.3, "paper");
        books[1] = new Book(234, "Story2", "Author2", "PPP", 1968, 456, 44.3, "paper");
        books[2] = new Book(345, "Story3", "Author1", "TTT", 1978, 321, 33.3, "paper");
        books[3] = new Book(228, "Story4", "Author3", "TTT", 2001, 558, 33.9, "paper");
        books[4] = new Book(345, "Story5", "Author4", "WWW", 2002, 238, 25.8, "paper");

        BookInformation bookInformation = new BookInformation(books);

        System.out.println("Введите имя автора для поиска книг:");
        bookInformation.findBooksByAuthor("Author1");

        System.out.println("Книги издательства TTT:");
        bookInformation.findBooksByPublishingOffice("TTT");

        System.out.println("Книги, выпущенные после 1965 года:");
        bookInformation.findBooksAfterYearOfPubl(1965);
    }


}
