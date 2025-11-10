package book.chapter5;

public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 100; j++) {
                if(j == 10)break outer;
                System.out.println("j = " + j);
            }
            System.out.println("never seen");
        }
        System.out.println("cycles has ended");
    }
}
