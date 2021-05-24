class Solution {
    public ArrayList<Integer> reverseLevelOrder(Node node) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        queue.add(node);
        while (!queue.isEmpty()) {
            Node temp = queue.peek();

            // Add Right first and then left
            if (temp.right != null) {
                queue.add(temp.right);
            }

            if (temp.left != null) {
                queue.add(temp.left);
            }

            queue.poll();
            stack.push(temp.data);
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        return list;
    }
}