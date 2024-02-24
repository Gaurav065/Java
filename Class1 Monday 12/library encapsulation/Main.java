import java.util.Random;

class Book {
    private String title;
    private String author;
    private int id;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = generateId();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    private int generateId() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }
}

class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public Book borrowBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                Book borrowedBook = books[i];
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                count--;
                return borrowedBook;
            }
        }
        return null;
    }

    public void returnBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full. Cannot return the book.");
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < count; i++) {
            System.out.println("Title: " + books[i].getTitle() + ", Author: " + books[i].getAuthor() + ", ID: " + books[i].getId());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library(3);

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        Book borrowedBook = library.borrowBook(book2.getId());
        if (borrowedBook != null) {
            System.out.println("Borrowed Book: " + borrowedBook.getTitle() + " by " + borrowedBook.getAuthor());
        } else {
            System.out.println("Book not found in the library.");
        }

        if (borrowedBook != null) {
            library.returnBook(borrowedBook);
            System.out.println("Returned Book: " + borrowedBook.getTitle() + " by " + borrowedBook.getAuthor());
        }

        library.displayBooks();
    }
}
 