class Solution {

    Node removeDuplicates(Node head) {

        Node current = head.next;
        Node prev = head;

        while (current != null) {
            if (prev.data == current.data) {
                prev.next = current.next;
                current = prev.next;
            } else {
                prev = current;
                current = current.next;
            }
        }

        return head;

    }
}
