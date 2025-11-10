package book.chapter4;

public class Example25 {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Пepвoнaчaльнoe значение а: " + a);
        System.out.println("i and b: " + i + " " + b);

    }
}
