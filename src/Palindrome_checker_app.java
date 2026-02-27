import java.util.*;
class PalindromeChecker {
    private Stack<Character> stack;
    public PalindromeChecker() {
        stack = new Stack<>();
    }
    public boolean checkPalindrome(String input) {
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        for (int i = 0; i < processed.length(); i++) {
            stack.push(processed.charAt(i));
        }
        for (int i = 0; i < processed.length(); i++) {
            char original = processed.charAt(i);
            char reversed = stack.pop();

            if (original != reversed) {
                return false;
            }
        }

        return true;
    }
}
public class UseCase11PalindromeCheckerApp {

    public static void main(String args[]) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");

        String input = "A man a plan a canal panama";
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}