package Mod4.task9;

public class BookInformation {
    private Book[] books;

    public BookInformation(Book[] books) {
        this.books = books;
    }

    public void findBooksByAuthor(String nameAuthor) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(nameAuthor)) {
                System.out.println(books[i]);
            }

        }
    }

    public void findBooksByPublishingOffice(String publishingHouse) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishingOffice().equals(publishingHouse)) {
                System.out.println(books[i]);
            }
        }
    }

    public void findBooksAfterYearOfPubl(int yearOfPubl) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYearOfPublication() > yearOfPubl) {
                System.out.println(books[i]);
            }
        }

    }
}
