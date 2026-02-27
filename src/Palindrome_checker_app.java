import java.util.*;

public class Palindrome_checker_app {
    static int start = 0;
    public static boolean isPalindromeRecursive(String str, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        start++;
        return isPalindromeRecursive(str, end - 1);
    }
    public static void main(String args[]) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");
        String s1 = "madam";
        start = 0;

        boolean result = isPalindromeRecursive(s1, s1.length() - 1);

        System.out.println("Input : " + s1);
        System.out.println("Is Palindrome? : " + result);
    }
}