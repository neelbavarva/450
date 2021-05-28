public class Solution {
    public ArrayList<Integer> diagonal(Node root) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            Node t = queue.peek();
            while (t != null) {
                list.add(t.data);
                if (t.left != null) {
                    queue.add(t.left);
                }
                t = t.right;
            }

            queue.poll();
        }

        return list;
    }
}
