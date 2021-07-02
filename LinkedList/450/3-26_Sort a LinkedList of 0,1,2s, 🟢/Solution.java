public class Solution {
    static Node segregate(Node head) {
        int arr[] = new int[3];
        Node current = head;
        while (current != null) {
            arr[current.data]++;
            current = current.next;
        }

        current = head;
        while (current != null) {
            if (arr[0] != 0) {
                current.data = 0;
                arr[0]--;
                current = current.next;
            } else if (arr[1] != 0) {
                current.data = 1;
                arr[1]--;
                current = current.next;
            } else {
                current.data = 2;
                arr[2]--;
                current = current.next;
            }
        }

        return head;
    }
}
