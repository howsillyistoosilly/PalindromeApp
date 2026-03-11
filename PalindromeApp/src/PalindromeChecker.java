import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // UC9: Recursive palindrome check
        boolean isPalindrome = isPalindromeRecursive(input, 0, input.length() - 1);

        // Output result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    // UC9 Core Logic: Recursive palindrome checker
    public static boolean isPalindromeRecursive(String str, int left, int right) {
        // Base conditions
        if (left >= right) {
            return true;  // Single char or empty string is palindrome
        }

        // Compare first and last characters
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call: check inner substring
        return isPalindromeRecursive(str, left + 1, right - 1);
    }
}
