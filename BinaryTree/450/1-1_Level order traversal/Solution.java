class Solution {

    static ArrayList<Integer> levelOrder(Node node) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int i = 0;
        while (!queue.isEmpty()) {
            i++;
            Node temp = queue.peek();
            if (i % 2 == 0) {
                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            } else {

                if (temp.right != null) {
                    queue.add(temp.right);
                }

                if (temp.left != null) {
                    queue.add(temp.left);
                }
            }

            list.add(temp.data);
            queue.poll();
        }

        return list;
    }
}
