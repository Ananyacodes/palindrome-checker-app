import java.util.*;

public class Palindrome_checker_app {
    public static void main(String args[]){
        System.out.println("Welcome to the Palindrome Checker Management System\nVersion: 1.0\nSystem initialized successfully.");
        // UC7
        String s1 = "madam";
        Deque<Character> deque = new ArrayDeque<>();
        for(char c : s1.toCharArray()){
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while(deque.size() > 1){
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if(front != rear){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + s1);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}