package book.chapter3;

public class Example12 {
    public static void main(String[] args) {
        int x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x and y are - " + x + " " + y);
            x = y * 2;
        }
        /* y = 100 is error, variable is unavailable
        then how x variable is still available
         */
        System.out.println("x equals - " + x);
    }
}
