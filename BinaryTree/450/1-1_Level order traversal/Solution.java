class Solution {

    static ArrayList<Integer> levelOrder(Node node) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node temp = queue.peek();
            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }

            list.add(temp.data);
            queue.poll();
        }

        return list;
    }
}
