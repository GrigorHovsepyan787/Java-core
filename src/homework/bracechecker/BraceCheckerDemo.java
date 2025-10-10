package homework.bracechecker;


public class BraceCheckerDemo {
    public static void main(String[] args) {
        String line = "Hello! [] {} () (() ()) )) (( ";
        BraceChecker braceChecker = new BraceChecker(line);
        braceChecker.check();
    }
}
