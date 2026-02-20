import java.util.Stack;

public class Palindrome_checker_app {
    public static void main(String args[]){
        System.out.println("Welcome to the Palindrome Checker Managaement System\nVersion: 1.0\nSystem initialized successfully.");
        //UC5
        String s1 = "madam";
        Stack<Character> stack = new Stack<>();
        for(char c : s1.toCharArray()){
            stack.push(c);
        }
        boolean isPalindrome = true;
        for(char c : s1.toCharArray()){
            if(c != stack.pop()){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : "+ s1);
        System.out.println("Is Palindrome? : "+isPalindrome);
    }
}
