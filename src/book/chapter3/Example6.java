package book.chapter3;

public class Example6 {
    public static void main(String[] args) {
        int lightspeed = 186000;
        int days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = seconds * lightspeed;
        System.out.println("For " + days + " days");
        System.out.println("The light will pass about - " + distance + " miles.");
    }
}
