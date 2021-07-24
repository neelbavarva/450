import java.util.*;

public class Iterative {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node res = reverseList(head.next);

        head.next.next = head;

        head.next = null;

        return res;
    }

    // 3
    // |
    // 6 <- 2

    Node compute(Node head) {
        Node revHead = reverseList(head);

        Node curr = revHead;

        int max = curr.data;

        Node nextNode = curr.next;

        while (curr.next != null) {
            if (nextNode.data < curr.data) {
                curr.next = nextNode.next;
                nextNode = nextNode.next;
            } else {
                curr = nextNode;
                nextNode = nextNode.next;
            }
        }

        return reverseList(revHead);

    }
}
