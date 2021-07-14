public class Solution {
    static Queue<Integer> q1 = new LinkedList<Integer>();

    void push(int a) {
        q1.add(a);
    }

    int pop() {
        if (q1.isEmpty()) {
            return -1;
        }

        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q1.add(q1.poll());
        }

        return q1.poll();
    }
}
