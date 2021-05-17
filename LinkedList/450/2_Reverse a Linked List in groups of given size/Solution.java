class Solution {
    public static Node reverse(Node head, int k) {
        if (head == null) {
            return null;
        }

        Node current = head;
        Node next = null;
        Node previous = null;

        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = reverse(next, k);
        }

        return previous;
    }
}