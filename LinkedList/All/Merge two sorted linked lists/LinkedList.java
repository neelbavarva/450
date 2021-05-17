public class LinkedList {

    Node sortedMerge(Node head1, Node head2) {

        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        Node dummyNode = new Node(0);
        Node tail = dummyNode;

        Node i = head1;
        Node j = head2;

        while (true) {
            if (i == null) {
                tail.next = j;
                break;
            }

            if (j == null) {
                tail.next = i;
                break;
            }

            if (i.data <= j.data) {
                tail.next = i;
                i = i.next;
            } else {
                tail.next = j;
                j = j.next;
            }

            tail = tail.next;
        }

        return dummyNode.next;
    }
}
