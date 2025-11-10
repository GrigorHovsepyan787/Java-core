package book.chapter4;

public class Example26 {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;
        for (i = 0; i < 4; i++) {
            num = num << i;
            System.out.println(num);
        }
    }
}
