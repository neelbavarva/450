class Solution {

    static ArrayList<Integer> topView(Node root) {

        class QueueObj {
            Node node;
            int hd;

            QueueObj(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        Queue<QueueObj> queue = new LinkedList<QueueObj>();
        Map<Integer, Node> map = new TreeMap<Integer, Node>();
        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) {
            return null;
        } else {
            queue.add(new QueueObj(root, 0));
        }

        while (!queue.isEmpty()) {

            QueueObj temp = queue.poll();
            if (!map.containsKey(temp.hd)) {
                map.put(temp.hd, temp.node);
            }

            if (temp.node.left != null) {
                queue.add(new QueueObj(temp.node.left, temp.hd - 1));
            }

            if (temp.node.right != null) {
                queue.add(new QueueObj(temp.node.right, temp.hd + 1));
            }
        }

        for (Map.Entry<Integer, Node> entry : map.entrySet()) {
            list.add(entry.getValue().data);
        }

        return list;
    }
}