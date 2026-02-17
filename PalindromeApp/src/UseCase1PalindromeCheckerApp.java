import java.util.Scanner;

public class UseCase1PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to Check for Palindrome:");
        String word = sc.nextLine();

        boolean isPalindrome = true;
        int length = word.length();
        String Reverse ="";
        for (int i = length-1; i >=0; i--) {
            Reverse += word.charAt(i);
        }
        if (word.equals(Reverse)){
            System.out.println("Result: The string is a palindrome.");

        }
        else
        {
            System.out.println("Result: The string NOT a palindrome.");
        }
    }
}