public class Solution {
    Node compute(Node head) {
        if (head == null) {
            return null;
        }

        head.next = compute(head.next);

        if (head.next != null && head.next.data > head.data) {
            return head.next;
        } else {
            return head;
        }
    }
}
