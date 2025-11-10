package book.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:{
            second:{
            third:{
                System.out.println("before break");
                if(t) break second;
                System.out.println("not seen");
            }
                System.out.println("not seen");
            }
            System.out.println("after second block");
        }
    }
}
