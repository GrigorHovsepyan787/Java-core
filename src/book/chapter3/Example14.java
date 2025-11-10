package book.chapter3;

public class Example14 {
    public static void main(String[] args) {
        int i = 257;
        double d = 325.124;
        byte b = (byte) i;
        System.out.println("Converting int i = " + i + " to byte b = " + b);
        i = (int) d;
        System.out.println("Converting double d = " + d + " to int i = " + i);
        b = (byte) d;
        System.out.println("Converting double d = " + d + " to byte b = " + b);
    }
}
