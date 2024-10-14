/*Question :  Insert a node at the given position in a linked list. We are given a pointer to a node, and the
new node is inserted after the given node.
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

public class Question2 {
    Node head;

    void insertAfter(Node prev, int newData) {
        if (prev == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Question2 list = new Question2();

        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(5);
        list.head.next.next.next.next = new Node(6);


        System.out.println("Original linked list");
        list.printList();

        Node prev = list.head.next;
        int newData = 3;
        list.insertAfter(prev, newData);

        System.out.println("Linked list after new insertion");
        list.printList();
    }
}
