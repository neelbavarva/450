class Solution {
    int height(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }

    int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int currDiameter = leftHeight + rightHeight + 1;

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max(currDiameter, Math.max(leftDiameter, rightDiameter));
    }
}