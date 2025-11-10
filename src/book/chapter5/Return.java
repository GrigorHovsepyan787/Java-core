package book.chapter5;

public class Return {
    static void main(String[] args) {
        boolean t = true;
        System.out.println("before return");
        if(t)return;
        System.out.println("never seen");
    }
}
