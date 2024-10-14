/*Question  :  Given the head of a sorted linked list, delete all duplicates such that each element
appears only once. Return the linked list sorted as well
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

public class Question3 {
    Node head;

    Node deleteDuplicates(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
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
        Question3 llist = new Question3();

        llist.head = new Node(1);
        llist.head.next = new Node(1);
        llist.head.next.next = new Node(2);
        llist.head.next.next.next = new Node(3);
        llist.head.next.next.next.next = new Node(3);

        System.out.println("original linked list");
        llist.printList();

        llist.head = llist.deleteDuplicates(llist.head);
        System.out.println("linked list after deleteing duplicates");
        llist.printList();
    }
}
