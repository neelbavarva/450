public class Solution {
    void leafNode(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        leafNode(node.left, list);
        if (node.left == null && node.right == null) {
            list.add(node.data);
        }
        leafNode(node.right, list);
    }

    void boundaryLeft(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            list.add(node.data);
            boundaryLeft(node.left, list);
        } else if (node.right != null) {
            list.add(node.data);
            boundaryLeft(node.right, list);
        }
    }

    void boundaryRight(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }

        if (node.right != null) {
            list.add(node.data);
            boundaryRight(node.right, list);
        } else if (node.left != null) {
            list.add(node.data);
            boundaryRight(node.left, list);
        }
    }

    ArrayList<Integer> printBoundary(Node node) {
        if (node == null) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();

        list.add(node.data);

        boundaryLeft(node.left, list);
        leafNode(node.left, list);
        leafNode(node.right, list);

        boundaryRight(node.right, rightList);

        for (int i = rightList.size() - 1; i >= 0; i--) {
            list.add(rightList.get(i));
        }

        return list;
    }
}
