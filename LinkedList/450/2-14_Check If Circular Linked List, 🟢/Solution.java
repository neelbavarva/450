class Solution {
    boolean isCircular(Node head) {
        if (head == null) {
            return true;
        }

        Node current = head;
        while (current != null) {
            if (current.next == head) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}