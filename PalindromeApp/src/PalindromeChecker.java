import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // UC5: Stack-based palindrome check
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop from stack and compare with original characters
        boolean isPalindrome = true;
        for (int i = 0; i < input.length(); i++) {
            if (stack.isEmpty() || input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome && stack.isEmpty()) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
