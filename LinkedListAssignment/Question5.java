/*Question : Given two numbers represented by two lists, write a function that returns the sum list. The
sum list is a list representation of the addition of two input numbers.
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

public class Question5 {
    Node head;

    Node addTwoNumbers(Node l1, Node l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        Node dummyHead = new Node(0);
        Node p = l1, q = l2, curr = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        if (carry > 0) {
            curr.next = new Node(carry);
        }

        return reverseList(dummyHead.next);
    }

    Node reverseList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Question5 llist1 = new Question5();

        llist1.head = new Node(7);
        llist1.head.next = new Node(5);
        llist1.head.next.next = new Node(9);
        llist1.head.next.next.next = new Node(4);
        llist1.head.next.next.next.next = new Node(6);

        Node l1 = llist1.head;

        Question5 llist2 = new Question5();

        llist2.head = new Node(8);
        llist2.head.next = new Node(4);

        Node l2 = llist2.head;

        Node sumList = llist1.addTwoNumbers(l1, l2);

        System.out.println("Sum list : ");
        llist1.printList(sumList);

    }
}
