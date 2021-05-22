class Solution {

    public static Node addOne(Node head) {

        // Reversed the Linkedlist
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

        int carry = 0;
        Node temp = head;

        if (temp.data == 9) {
            temp.data = 0;
            carry = 1;
        } else {
            temp.data = temp.data + 1;
        }

        temp = temp.next;

        while (temp != null && carry == 1) {
            if (temp.data == 9 && carry == 1) {
                temp.data = 0;
                carry = 1;
            } else if (temp.data != 9 && carry == 1) {
                temp.data = temp.data + 1;
                carry = 0;
            }

            temp = temp.next;
        }

        // Reversed the Linkedlist
        Node prev1 = null;
        Node curr1 = head;
        Node next1 = null;

        while (curr1 != null) {
            next1 = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = next1;
        }
        head = prev1;

        if (carry == 1) {
            Node node = new Node(1);
            node.next = head;
            head = node;
        }

        return head;

    }
}
