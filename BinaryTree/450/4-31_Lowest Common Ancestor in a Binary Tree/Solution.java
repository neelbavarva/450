public class Solution {
    public Node lca(Node root, int n1, int n2) {
        Node leftNode = null;
        Node rightNode = null;

        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        leftNode = lca(root.left, n1, n2);
        rightNode = lca(root.right, n1, n2);

        if (leftNode != null && rightNode != null) {
            return root;
        }

        return (leftNode != null) ? leftNode : rightNode;

    }
}
