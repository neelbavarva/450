public class Solution {

    // Without Order
    Node divideEvenOdd(int N, Node head) {
        Node i = head;
        Node j = head.next;

        while (i != null && j != null) {
            if (i.data % 2 == 1 && j.data % 2 == 1) {
                j = j.next;
            } else if (i.data % 2 == 0 && j.data % 2 == 0) {
                i = i.next;
                j = j.next;
            } else if (i.data % 2 == 1 && j.data % 2 == 0) {
                int temp = i.data;
                i.data = j.data;
                j.data = temp;
                i = i.next;
            } else {
                i = i.next;
            }
        }

        return head;
    }
}
