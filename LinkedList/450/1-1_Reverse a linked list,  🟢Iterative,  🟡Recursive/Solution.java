class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    // Recursive
    static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        /*
         * reverse the rest list and put the first element at the end
         */
        Node rest = reverse(head.next);
        head.next.next = head;

        /* tricky step -- see the diagram */
        head.next = null;

        /* fix the head pointer */
        return rest;
    }

}