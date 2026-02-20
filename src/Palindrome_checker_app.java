public class Palindrome_checker_app {
    public static void main(String args[]){
        System.out.println("Welcome to the Palindrome Checker Managaement System\nVersion: 1.0\nSystem initialized successfully.");
        //UC4
        String s1 = "madam";
        char[] chars = s1.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;
        while(start<end){
            if(chars[start] != chars[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input : "+ s1);
        System.out.println("Is Palindrome? : "+isPalindrome);
    }
}
