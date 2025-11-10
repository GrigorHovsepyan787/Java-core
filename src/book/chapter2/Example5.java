package book.chapter2;

public class Example5 {
    public static void main(String[] args) {
        int y = 20;
        for (int x = 0; x < 10; x++) {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            y -= 2;
        }
    }
}
