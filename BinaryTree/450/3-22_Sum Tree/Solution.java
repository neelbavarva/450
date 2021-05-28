public class Solution {
    public int sum(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return node.data;
        }

        return sum(node.left) + sum(node.right) + node.data;
    }

    boolean isSumTree(Node root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        return ((root.data == sum(root.left) + sum(root.right)) && isSumTree(root.left) && isSumTree(root.right));
    }
}
