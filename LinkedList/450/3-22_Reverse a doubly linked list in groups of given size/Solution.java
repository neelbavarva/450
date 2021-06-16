public class Solution {
    static Node revListInGroupOfGivenSize(Node head, int k) {
        Node current = head;
        Node next = null;
        Node newHead = null;
        int count = 0;

        // reversing the current group of k
        // or less than k nodes by adding
        // them at the beginning of list
        // 'newHead'
        while (current != null && count < k) {
            next = current.next;
            newHead = push(newHead, current);
            current = next;
            count++;
        }

        // if next group exists then making the desired
        // adjustments in the link
        if (next != null) {
            head.next = revListInGroupOfGivenSize(next, k);
            head.next.prev = head;
        }

        // pointer to the new head of the
        // reversed group
        return newHead;
    }
}
