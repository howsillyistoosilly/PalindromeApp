import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to Check for Palindrome:");
        String word = sc.nextLine();

        boolean isPalindrome = true;

        int length = word.length();
        int start = 0;
        int end = length -1;
        while (start<end){
            if (word.charAt(start)!= word.charAt(end)){
                isPalindrome = false;
            }
            start++;
            end--;
            }
        if (isPalindrome = true){
            System.out.println("Result : Given word is a palindrome");
        }
        else{
            System.out.println("Result : Given word is Not a palindrome");
        }
    }
}