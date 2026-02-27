import java.util.*;

public class UseCase13PalindromePerformanceApp {

    public static boolean stackMethod(String input) {
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

    public static boolean dequeMethod(String input) {
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

    public static boolean arrayMethod(String input) {
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        char[] arr = processed.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");

        String input = "A man a plan a canal panama";

        long startTime, endTime;

        startTime = System.nanoTime();
        boolean stackResult = stackMethod(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean dequeResult = dequeMethod(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean arrayResult = arrayMethod(input);
        endTime = System.nanoTime();
        long arrayTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println();

        System.out.println("Stack Method Result : " + stackResult);
        System.out.println("Stack Method Time (ns) : " + stackTime);

        System.out.println();

        System.out.println("Deque Method Result : " + dequeResult);
        System.out.println("Deque Method Time (ns) : " + dequeTime);

        System.out.println();

        System.out.println("Array Method Result : " + arrayResult);
        System.out.println("Array Method Time (ns) : " + arrayTime);
    }
}