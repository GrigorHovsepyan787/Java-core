package book.chapter3;

public class Example10 {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("b is - " + b);
        b = true;
        System.out.println("b now is - " + b);
        if (b) {
            System.out.println("This code will be executed");
        }
        if (!b) {
            System.out.println("This code will NOT be executed");
        }
        System.out.println("10 > 9 is - " + (10 > 9));

    }
}
