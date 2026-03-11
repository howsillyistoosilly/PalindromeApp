import java.util.Scanner;

// Node class for singly linked list
class ListNode {
    char data;
    ListNode next;

    ListNode(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        // UC8: Convert string to linked list
        ListNode head = null;
        ListNode tail = null;

        for (char c : input.toCharArray()) {
            ListNode newNode = new ListNode(c);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Check palindrome using fast-slow pointer + reverse
        boolean isPalindrome = isPalindrome(head);

        // Output result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    // UC8 Core Logic: Fast-Slow Pointer + Reverse Second Half
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle using fast-slow pointers
        ListNode slow = head;
        ListNode fast = head;
        ListNode prevSlow = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;      // Fast moves 2 steps
            prevSlow = slow;
            slow = slow.next;           // Slow moves 1 step
        }

        // Step 2: Reverse second half
        prevSlow.next = null;           // Split list
        ListNode secondHalf = reverse(slow);

        // Step 3: Compare first half with reversed second half
        ListNode firstHalf = head;
        while (firstHalf != null && secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return firstHalf == null && secondHalf == null;
    }

    // In-place reversal of second half
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}
