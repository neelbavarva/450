class Solution {

    public static void removeLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (slow != fast) {
            return;
        }

        if (fast == head) {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = null;
        } else {
            fast = head;

            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = null;
        }
    }
}