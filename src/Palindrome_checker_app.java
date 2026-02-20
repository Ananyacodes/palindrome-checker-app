import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome_checker_app {
    public static void main(String args[]){
        System.out.println("Welcome to the Palindrome Checker Managaement System\nVersion: 1.0\nSystem initialized successfully.");
        //UC6
        String s1 = "madam";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for(char c : s1.toCharArray()){
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while(!queue.isEmpty()){
            if(queue.remove() != stack.pop()){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : "+ s1);
        System.out.println("Is Palindrome? : "+isPalindrome);
    }
}
