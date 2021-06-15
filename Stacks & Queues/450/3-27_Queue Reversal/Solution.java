public class Solution {

    // Simple Approach
    public Queue<Integer> rev(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        return q;
    }

    // Recursive
    public void reverse(Queue<Integer> q, int x) {
        if (q.isEmpty()) {
            q.add(x);
        } else {

            int temp = q.poll();
            reverse(q, temp);
            q.add(temp);
        }
    }

    public Queue<Integer> rev(Queue<Integer> q) {
        int temp = q.peek();
        reverse(q, temp);
        q.poll();

        return q;
    }
}
