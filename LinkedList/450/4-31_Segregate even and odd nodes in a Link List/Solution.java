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

    // With Order but TLE in GFG
    Node divide(int N, Node head) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();

        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                q1.add(current.data);
                current = current.next;
            } else {
                q2.add(current.data);
                current = current.next;
            }
        }

        current = head;
        while (!q1.isEmpty() && !q2.isEmpty() && current != null) {
            if (current.data % 2 == 0) {
                current.data = q1.poll();
                current = current.next;
            } else {
                current.data = q1.poll();
                current = current.next;
            }
        }

        if (!q2.isEmpty()) {
            while (current != null) {
                current.data = q2.poll();
                current = current.next;
            }
        }

        return head;

    }

    // Thakker ka Code, working
    Node divideIt(int N, Node head) {
        Node oddll = new Node(-1), curr = head, prev = null, nextNode = head.next, temp = oddll;

        while (curr != null) {
            if ((curr.data & 1) == 1) {
                temp.next = new Node(curr.data);
                temp = temp.next;

                if (prev == null) {
                    head = nextNode;
                    curr = head;

                    if (head != null) {
                        nextNode = head.next;
                    }
                } else {
                    prev.next = nextNode;
                    curr = nextNode;
                    if (nextNode != null) {
                        nextNode = nextNode.next;
                    }
                }

                continue;
            }

            prev = curr;
            curr = nextNode;
            if (nextNode != null) {
                nextNode = nextNode.next;
            }
        }

        if (prev == null) {
            head = oddll.next;
        } else {
            prev.next = oddll.next;
        }

        return head;
    }
}
