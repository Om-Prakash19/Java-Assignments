/*Question  : Given the head of a singly linked list, return true if it is a palindrome or false otherwise
 * 
 */

package LinkedListAssignment;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Question4 {
    Node head;

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node reversedSecondHalf = reverse(slow);

        Node firstHalf = head;
        Node secondHalf = reversedSecondHalf;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        Question4 ll = new Question4();

        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(2);
        ll.head.next.next.next = new Node(1);

        if (ll.isPalindrome(ll.head)) {
            System.out.println("Given linked list is a palindome");
        } else {
            System.out.println("Given linked list is not a palindrome");
        }
    }
}
