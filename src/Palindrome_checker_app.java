import java.util.*;

public class Palindrome_checker_app {
    static int start = 0;
    public static boolean isPalindromeIgnoreCase(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");
        String s1 = "A man a plan a canal panama";
        start = 0;

        boolean result = isPalindromeIgnoreCase(s1);

        System.out.println("Input : " + s1);
        System.out.println("Is Palindrome? : " + result);
    }
}