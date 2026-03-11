import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // UC7: Deque-based optimized palindrome check
        Deque<Character> deque = new ArrayDeque<>();

        // Insert all characters into deque
        for (char c : input.toCharArray()) {
            deque.offerLast(c);
        }

        // Compare front and rear until deque is empty
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.pollFirst();   // Remove from front
            char rear = deque.pollLast();     // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
