public class Palindrome_checker_app {
    public static void main(String args[]){
        System.out.println("Welcome to the Palindrome Checker Managaement System\nVersion: 1.0\nSystem initialized successfully.");
        //UC2
        String s1 = "Quetzalcoatlus is my favourite dinosaur";
        int l = s1.length();
        String reversed = "";
        for(int i=l-1;i>0;i--){
            reversed += s1.charAt(i);
        }
        boolean result = s1.equals(reversed);
        System.out.println("Input text: "+ s1);
        System.out.println("Is it a Palindrome? : "+result);
    }
}
