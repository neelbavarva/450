public class Solution {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        while (k > 0) {
            stack.push(q.poll());
            k--;
        }

        while (!q.isEmpty()) {
            queue.add(q.poll());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        while (!queue.isEmpty()) {
            q.add(queue.poll());
        }

        return q;
    }
}
