class Solution {

    // Using LinkedList
    public Node removeDuplicatesList(Node head) {
        List<Integer> list = new LinkedList<>();

        Node current = head.next;
        Node prev = head;

        list.add(head.data);
        while (current != null) {
            if (!list.isEmpty() && list.contains(current.data)) {
                prev.next = current.next;
                current.next = null;
                current = prev.next;
            } else {
                list.add(current.data);
                prev = current;
                current = current.next;
            }
        }

        return head;

    }

    // Using nested Loop
    public Node removeDuplicates(Node head) {
        Node current = head;
        Node temp = null;
        while (current != null) {
            temp = current;
            while (temp.next != null) {
                if (temp.next.data == current.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            current = current.next;
        }

        return head;

    }
}