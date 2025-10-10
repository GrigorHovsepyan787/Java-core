package homework.bracechecker;

import java.util.Stack;

public class BraceChecker {
    private final String word;
    private boolean error = false;

    public BraceChecker(String line) {
        word = line;
    }

    Stack<Character> stack = new Stack<>();

    public void check() {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '[' || word.charAt(i) == '(' || word.charAt(i) == '{') {
                stack.push(word.charAt(i));
            }
            if (stack.isEmpty() && word.charAt(i) == ')') {
                System.out.println("Error: brace " + word.charAt(i) + " at " + i + " is closing but it  isn't opened");
                error = true;
            } else if (stack.isEmpty() && word.charAt(i) == ']') {
                System.out.println("Error: brace " + word.charAt(i) + " at " + i + " is closing but it  isn't opened");
                error = true;
            }
            else if (stack.isEmpty() && word.charAt(i) == '}') {
                System.out.println("Error: brace " + word.charAt(i) + " at " + i + " is closing but it  isn't opened");
                error = true;
            } else {
                if (word.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                }
                else if (word.charAt(i) == ']' && stack.peek() != '[') {
                    System.out.println("Error: brace " + stack.peek() + " opens at " + word.indexOf(stack.peek()) + " and closed b " + word.charAt(i) + " at " + i + " closes");
                    error = true;
                }
                if (word.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                else if (word.charAt(i) == '}' && stack.peek() != '{') {
                    System.out.println("Error: brace " + stack.peek() + " opens at " + word.indexOf(stack.peek()) + " and closed b " + word.charAt(i) + " at " + i + " closes");
                    error = true;
                }
                if (word.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                else if (word.charAt(i) == ')' && stack.peek() != '(') {
                    System.out.println("Error: brace " + stack.peek() + " opens at " + word.indexOf(stack.peek()) + " and closed by " + word.charAt(i) + " at " + i + " closes");
                    error = true;
                }
            }
        }
        while(!stack.isEmpty()) {
            System.out.println("Error: brace " + stack.peek() + " at " + word.indexOf(stack.peek()) + " is opened but never gets closed");
            error = true;
            stack.pop();
        }
        if (!error) {
            System.out.println("Sentence is OK!");
        }
    }
}
