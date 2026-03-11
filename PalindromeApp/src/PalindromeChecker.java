import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // UC6: Queue + Stack based palindrome check
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue AND Push all characters
        for (char c : input.toCharArray()) {
            queue.offer(c);      // FIFO: Enqueue (front)
            stack.push(c);       // LIFO: Push (top)
        }

        // Compare dequeue vs pop until queue is empty
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char queueFront = queue.poll();    // FIFO: Dequeue from front
            char stackTop = stack.pop();       // LIFO: Pop from top

            if (queueFront != stackTop) {
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
