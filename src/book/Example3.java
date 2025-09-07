package book;

public class Example3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x < y");
        }
        x *= 2;
        if (x == y) {
            System.out.println("x = y");
        }
        x *= 2;
        if (x > y) {
            System.out.println("x > y");
        }

    }
}
