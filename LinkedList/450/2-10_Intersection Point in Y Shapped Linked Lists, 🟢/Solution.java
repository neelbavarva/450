class Solution {

    int getSize(Node head) {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    int intersectPoint(Node head1, Node head2) {
        int size1 = getSize(head1);
        int size2 = getSize(head2);

        int diff = Math.abs(size1 - size2);
        if (size1 > size2) {
            Node i = head1;
            Node j = head2;
            while (diff != 0) {
                i = i.next;
                diff--;
            }

            while (i.next != null && j.next != null) {
                if (i.next == j.next) {
                    return i.next.data;
                } else {
                    i = i.next;
                    j = j.next;
                }
            }
        } else if (size1 < size2) {
            Node i = head1;
            Node j = head2;
            while (diff != 0) {
                j = j.next;
                diff--;
            }

            while (i.next != null && j.next != null) {
                if (i.next == j.next) {
                    return i.next.data;
                } else {
                    i = i.next;
                    j = j.next;
                }
            }
        } else {
            Node i = head1;
            Node j = head2;
            while (i.next != null && j.next != null) {
                if (i.next == j.next) {
                    return i.next.data;
                } else {
                    i = i.next;
                    j = j.next;
                }
            }
        }

        return -1;
    }
}
