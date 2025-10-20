package homework.library;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import java.util.Scanner;

public class LibraryDemo implements Commands {
    private static Scanner scan = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scan.nextLine();
            switch (command) {
                case EXIT -> isRun = false;
                case ADD -> addBook();
                case PRINT -> printAllBooks();
                case SEARCH -> searchBook();
                case MAX_PRICE -> expensiveBook();
                case DELETE -> deleteBook();
                case FIND_PRICE -> findByrange();
                default -> System.err.println("Wrong command!!!");
            }
        }
    }

    private static void printCommands() {
        System.out.println("Input " + EXIT + " to exit");
        System.out.println("Input " + ADD + " to add book");
        System.out.println("Input " + PRINT + " to print all books");
        System.out.println("Input " + SEARCH + " to search book by title");
        System.out.println("Input " + MAX_PRICE + " to get the most expensive book");
        System.out.println("Input " + DELETE + " to delete the book by its id");
        System.out.println("Input " + FIND_PRICE + " to find a book by needed price range");
    }

    private static void addBook() {
        System.out.println("Input book title");
        String bookTitle = scan.nextLine();
        System.out.println("Input author of book");
        String bookAuthor = scan.nextLine();
        System.out.println("Input the price of book");
        Double price = scan.nextDouble();
        System.out.println("Input the quantity of books");
        int quantity = scan.nextInt();
        Book book = new Book(bookTitle, bookAuthor, price, quantity);
        bookStorage.add(book);
        System.out.println("Book has been successfully added!");
    }

    private static void printAllBooks() {
        if (bookStorage.getSize() == 0) {
            System.err.println("Storage is empty!");
        } else {
            bookStorage.print();
        }
    }

    private static void searchBook() {
        if (bookStorage.getSize() == 0) {
            System.err.println("Storage is empty!");
        } else {
            System.out.println("Input title");
            String keyword = scan.nextLine();
            bookStorage.search(keyword);
        }
    }

    private static void expensiveBook() {
        if (bookStorage.getSize() == 0) {
            System.err.println("Storage is empty!");
        } else {
            System.out.println(bookStorage.getByMaxPrice());
        }
    }

    private static void deleteBook(){
        if (bookStorage.getSize() == 0) {
            System.err.println("Storage is empty!");
        } else {
            System.out.println("Input the id");
            int id = scan.nextInt();
            bookStorage.deleteByIndex(id);
        }
    }
    private static void findByrange(){
        if (bookStorage.getSize() == 0) {
            System.err.println("Storage is empty!");
        } else {
            System.out.println("Input min price");
            double min = scan.nextDouble();
            System.out.println("Input max price");
            double max = scan.nextDouble();
            bookStorage.priceRange(min, max);
        }
    }
}
