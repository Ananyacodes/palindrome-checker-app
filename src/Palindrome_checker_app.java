public class Palindrome_checker_app {
    public static void main(String args[]){
        System.out.println("Welcome to the Palindrome Checker Managaement System\nVersion: 1.0\nSystem initialized successfully.");
        //UC2
        String s1 = "Quetzalcoatlus is my favourite dinosaur";
        boolean flag = true;
        int l = s1.length();
        for(int i=0;i<l/2;i++){
            if(s1.charAt(i) != s1.charAt(l-i-1)){
                flag = false;
                break;
            }
        }System.out.println("Input text: "+ s1);
        System.out.println("Is it a Palindrome? : "+flag);
    }
}
