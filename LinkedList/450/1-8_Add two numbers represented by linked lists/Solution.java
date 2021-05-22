class Solution {

    static int size(Node head) {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    static Node addTwoLists(Node first, Node second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }

        Node prev = null;
        Node curr = first;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        first = prev;

        Node prev1 = null;
        Node curr1 = second;
        Node next1 = null;

        while (curr1 != null) {
            next1 = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = next1;
        }

        second = prev1;

        int carry = 0;
        Node i = first;
        Node j = second;

        int size1 = size(first);
        int size2 = size(second);

        if (size1 >= size2) {
            while (i != null && j != null) {
                int temp = i.data + j.data + carry;
                carry = temp / 10;
                temp = temp % 10;
                i.data = temp;
                i = i.next;
                j = j.next;
            }

            if (i == null && carry != 0) {
                Node prev2 = null;
                Node curr2 = first;
                Node next2 = null;

                while (curr2 != null) {
                    next2 = curr2.next;
                    curr2.next = prev2;
                    prev2 = curr2;
                    curr2 = next2;
                }

                first = prev2;

                Node node = new Node(carry);
                node.next = first;
                first = node;
            } else if (i != null && carry != 0) {
                while (i != null) {
                    int temp = i.data + carry;
                    carry = temp / 10;
                    temp = temp % 10;
                    i.data = temp;
                    i = i.next;
                }

                Node prev2 = null;
                Node curr2 = first;
                Node next2 = null;

                while (curr2 != null) {
                    next2 = curr2.next;
                    curr2.next = prev2;
                    prev2 = curr2;
                    curr2 = next2;
                }

                first = prev2;
                if (carry != 0) {
                    Node node = new Node(carry);
                    node.next = first;
                    first = node;
                }
            } else {
                Node prev2 = null;
                Node curr2 = first;
                Node next2 = null;

                while (curr2 != null) {
                    next2 = curr2.next;
                    curr2.next = prev2;
                    prev2 = curr2;
                    curr2 = next2;
                }

                first = prev2;
            }

            return first;

        } else {
            while (i != null && j != null) {
                int temp = i.data + j.data + carry;
                carry = temp / 10;
                temp = temp % 10;
                j.data = temp;
                i = i.next;
                j = j.next;
            }

            if (j == null && carry != 0) {
                Node prev2 = null;
                Node curr2 = second;
                Node next2 = null;

                while (curr2 != null) {
                    next2 = curr2.next;
                    curr2.next = prev2;
                    prev2 = curr2;
                    curr2 = next2;
                }

                second = prev2;

                Node node = new Node(carry);
                node.next = second;
                second = node;
            } else if (j != null && carry != 0) {
                while (j != null) {
                    int temp = j.data + carry;
                    carry = temp / 10;
                    temp = temp % 10;
                    j.data = temp;
                    j = j.next;
                }

                Node prev2 = null;
                Node curr2 = second;
                Node next2 = null;

                while (curr2 != null) {
                    next2 = curr2.next;
                    curr2.next = prev2;
                    prev2 = curr2;
                    curr2 = next2;
                }

                second = prev2;

                if (carry != 0) {
                    Node node = new Node(carry);
                    node.next = second;
                    second = node;
                }
            } else {
                Node prev2 = null;
                Node curr2 = second;
                Node next2 = null;

                while (curr2 != null) {
                    next2 = curr2.next;
                    curr2.next = prev2;
                    prev2 = curr2;
                    curr2 = next2;
                }

                second = prev2;
            }

        }

        return second;

    }
}