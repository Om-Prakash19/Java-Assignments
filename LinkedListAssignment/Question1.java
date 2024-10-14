/*Question :  Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
 * 
 * Answer :  
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

public class Question1 {
    Node head;

    boolean search(Node head, int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Question1 llist = new Question1();

        llist.head = new Node(14);
        llist.head.next = new Node(21);
        llist.head.next.next = new Node(11);
        llist.head.next.next.next = new Node(30);
        llist.head.next.next.next = new Node(10);

        int x = 14;
        if (llist.search(llist.head, x)) {
            System.out.println(x + " found in linked list");

        } else {
            System.out.println(x + " not found in linked list");
        }

    }
}
