import java.util.*;

public class Solution {
    class Node {
        int data;
        Node next, arb;

        Node(int d) {
            data = d;
            next = arb = null;

        }
    }

    Node copyList(Node head) {

        Node curr = head;
        Node temp;

        while (curr != null) {
            temp = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = temp;
            curr = temp;
        }

        curr = head;

        while (curr != null) {
            if (curr.arb != null) {
                curr.next.arb = curr.arb.next;
            } else {
                curr.next.arb = null;
            }

            curr = curr.next.next;
        }

        Node original = head;
        Node copy = head.next;

        temp = copy;

        while (original != null && copy != null) {
            original.next = original.next.next;
            if (copy.next != null) {
                copy.next = copy.next.next;
            } else {
                copy.next = null;
            }

            original = original.next;
            copy = copy.next;
        }

        return temp;

    }
}
