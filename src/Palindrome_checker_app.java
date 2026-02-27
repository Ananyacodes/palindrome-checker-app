import java.util.*;

interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String input) {
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : processed.toCharArray()) {
            stack.push(c);
        }
        for (char c : processed.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String input) {
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : processed.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeChecker {
    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.checkPalindrome(input);
    }
}

public class UseCase12PalindromeStrategyApp {
    public static void main(String args[]) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");

        String input = "madam";

        PalindromeStrategy strategy = new StackStrategy();
        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.execute(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}