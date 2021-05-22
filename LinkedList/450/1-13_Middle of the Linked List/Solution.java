class Solution {
    public int size(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    public ListNode middleNode(ListNode head) {
        int size = size(head);
        size = size / 2 + 1;
        int i = 1;
        ListNode current = head;
        while (i != size) {
            i++;
            current = current.next;
        }

        return current;

    }
}