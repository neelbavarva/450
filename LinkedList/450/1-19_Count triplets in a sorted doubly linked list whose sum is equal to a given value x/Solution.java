public class Solution {

    // Method 1
    static int countTriplets(Node head, int x) {
        Node ptr1, ptr2, ptr3;
        int count = 0;

        for (ptr1 = head; ptr1 != null; ptr1 = ptr1.next) {
            for (ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next) {
                for (ptr3 = ptr2.next; ptr3 != null; ptr3 = ptr3.next) {
                    if ((ptr1.data + ptr2.data + ptr3.data) == x) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    // Method 2
    static int countTriplets(Node head, int x) {
        Node ptr, ptr1, ptr2;
        int count = 0;

        HashMap<Integer, Node> um = new HashMap<Integer, Node>();

        for (ptr = head; ptr != null; ptr = ptr.next) {
            um.put(ptr.data, ptr);
        }

        for (ptr1 = head; ptr1 != null; ptr1 = ptr1.next) {

            for (ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next) {

                int p_sum = ptr1.data + ptr2.data;

                if (um.containsKey(x - p_sum) && um.get(x - p_sum) != ptr1 && um.get(x - p_sum) != ptr2) {
                    count++;
                }

            }
        }

        return (count / 3);
    }

    // Method 3 Efficient Approach

    static int countPairs(Node first, Node second, int value) {
        int count = 0;

        while (first != null && second != null && first != second && second.next != first) {

            if ((first.data + second.data) == value) {

                count++;
                first = first.next;
                second = second.prev;
            }

            else if ((first.data + second.data) > value) {
                second = second.prev;
            }

            else {
                first = first.next;
            }
        }

        return count;
    }

    static int countTriplets(Node head, int x) {
        if (head == null) {
            return 0;
        }

        Node current, first, last;
        int count = 0;

        last = head;
        while (last.next != null) {
            last = last.next;
        }

        for (current = head; current != null; current = current.next) {

            first = current.next;
            count += countPairs(first, last, x - current.data);
        }

        return count;
    }

}
