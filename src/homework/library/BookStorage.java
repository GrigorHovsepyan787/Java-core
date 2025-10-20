package homework.library;


public class BookStorage {
    private Book[] books = new Book[0];
    private int size = 0;

    public void add(Book book) {
        if (size > books.length - 1) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[size + 1];
        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }

    public void print(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void search(String keyword){
        for (Book book : books) {
            if(book.getTitle().equalsIgnoreCase(keyword)){
                System.out.println(book);
                break;
            }
        }
    }
    public int getSize(){
        return books.length;
    }
    public Book getByMaxPrice(){
        double price = 0;
        int maxInd = -1;
        for (int i = 0; i < books.length; i++) {
            if(books[i].getPrice() > price){
                price = books[i].getPrice();
                maxInd = i;
            }
        }
        return books[maxInd];
    }
    public void deleteByIndex(int index) {
        if (index > books.length - 1 || index < 0) {
            System.out.println("Index doesn't have a book");
        } else {
            Book[] tmp = new Book[books.length - 1];
            int temp = 0;
            for (int i = 0; i < tmp.length; i++) {
                if (i == index) {
                    temp++;
                }
                tmp[i] = books[temp];
                temp++;
            }
            books = tmp;
            System.out.println("Book has ben successfully deleted!");
        }
    }
    public void priceRange(double min, double max){
        for (Book book : books) {
            if(book.getPrice() > min && book.getPrice() < max){
                System.out.println(book);
            }
        }
    }

}
