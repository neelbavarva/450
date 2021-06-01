public class Solution {

    public static Node reverseDLL(Node head) {
        Node p = head;
        Node q = head;

        while (q != null) {
            p = q;

            Node temp = q.prev;
            q.prev = q.next;
            q.next = temp;

            q = q.prev;
        }

        return p;
    }
}
