public class Solution {
    void storeBSTNodes(Node root, Vector<Node> nodes) {
        // Base case
        if (root == null) {
            return;
        }

        storeBSTNodes(root.left, nodes);
        nodes.add(root);
        storeBSTNodes(root.right, nodes);
    }

    // Recursive function to construct Binary Tree
    Node buildTreeUtil(Vector<Node> nodes, int start, int end) {
        // base case
        if (start > end) {
            return null;
        }

        /* Get the middle element and make it root */
        int mid = (start + end) / 2;
        Node node = nodes.get(mid);

        // Using index in Inorder traversal, construct left and right subtress

        node.left = buildTreeUtil(nodes, start, mid - 1);
        node.right = buildTreeUtil(nodes, mid + 1, end);

        return node;
    }

    // This functions converts an unbalanced BST to a balanced BST
    Node buildTree(Node root) {

        Vector<Node> nodes = new Vector<Node>();
        storeBSTNodes(root, nodes);

        int n = nodes.size();
        return buildTreeUtil(nodes, 0, n - 1);
    }

}
