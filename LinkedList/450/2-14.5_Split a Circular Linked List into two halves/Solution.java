public class Solution {
    int getSize(circular_LinkedList list) {
        Node head = list.head;
        Node current = head;
        int size = 1;
        while (current.next != head) {
            size++;
            current = current.next;
        }

        return size;

    }

    void splitList(circular_LinkedList list) {
        int size = getSize(list);

        list.head1 = list.head;
        if (size % 2 == 0) {
            size = size / 2;
        } else {
            size = size / 2 + 1;
        }

        int index = 1;
        Node current = list.head;
        while (index != size) {
            current = current.next;
            index++;
        }

        Node temp = current.next;
        current.next = list.head;
        list.head1 = list.head;
        list.head2 = temp;

        while (temp.next != list.head) {
            temp = temp.next;
        }

        temp.next = list.head2;

    }
}
