class Solution {

    public static Node findIntersection(Node head1, Node head2) {
        Node head = new Node(1);

        Node i = head1;
        Node j = head2;

        while (i != null && j != null) {
            if (i.data < j.data) {
                i = i.next;
            } else if (i.data > j.data) {
                j = j.next;
            } else {
                if (head == null) {
                    head = new Node(i.data);
                    i = i.next;
                    j = j.next;
                } else {
                    Node node = new Node(i.data);
                    Node current = head;
                    while (current.next != null) {
                        current = current.next;
                    }
                    current.next = node;
                    i = i.next;
                    j = j.next;
                }

            }
        }

        Node temp = head;
        Node next = head.next;
        temp.next = null;
        head = next;

        return head;
    }
}
