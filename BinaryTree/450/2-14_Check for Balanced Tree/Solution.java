public class Solution {

    int height(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }

    boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }

        int left = 0;
        int right = 0;

        if (root.left != null) {
            left = height(root.left);
        }

        if (root.right != null) {
            right = height(root.right);
        }

        if (Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false;
    }
}
