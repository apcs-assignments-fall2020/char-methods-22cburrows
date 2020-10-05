import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (!(ch >= 'A' && ch <= 'Z')){
            return ch;
        }
        else {
            int a = ch; 
            a = a + 32;
            char ch2 = (char) a;
            return ch2;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String up = "";
        for (int i = 0; i < str.length(); i ++){
            String test = Character.toString(str.charAt(i));
            if (test ==  " "){
                up = up + test;
            }
            else{
                char st = toLower(str.charAt(i));
                up = up + st;
            }
        }
        return up;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (!(ch >= 'a' && ch <= 'z')){
            return ch;
        }
        else {
            int a = ch;
            a = a - 32;
            char ch2 = (char) a;
            return ch2;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String up2 = "";
        for (int i = 0; i < str.length(); i ++){
            String test = Character.toString(str.charAt(i));
            if (test == " "){
                up2 = up2 + test;
            }
            else{
                char st2 = toUpper(str.charAt(i));
                up2 = up2 + st2;
            }
        }
        return up2;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a String");
        String command = scan.next();
        System.out.println("What would you like to make your string lowercase or uppercase?");
        String test = scan.next();

        if (test.equals("lowercase")){
            System.out.println("Here is your string in lowercase: " + (myToLowerCase(command)));
        }
        else{
            System.out.println("Here is your string in uppercase: " + (myToUpperCase(command)));
        }

        scan.close();
    }
}
