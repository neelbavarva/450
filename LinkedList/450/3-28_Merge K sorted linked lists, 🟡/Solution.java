public class Solution {
    Node mergeKList(Node[] arr, int K) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            Node temp = arr[i];
            while (temp != null) {
                list.add(temp.data);
                temp = temp.next;
            }
        }

        Collections.sort(list);

        Node head = new Node(list.get(0));
        Node temp = head;

        for (int i = 1; i < list.size(); i++) {
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }

        return head;
    }
}
