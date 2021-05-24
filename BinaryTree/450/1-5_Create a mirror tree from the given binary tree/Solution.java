public class Solution {

    // Create a new Tree (Method 1)
    static Node mirrorify(Node root) {
        if (root == null) {
            return null;

        }

        Node mirror = createNode(root.val);
        mirror.right = mirrorify(root.left);
        mirror.left = mirrorify(root.right);
        return mirror;
    }

    // Swap Left and Right of each node (Method 2)
    static Node mirrorTree(Node root) {
        if (root == null) {
            return root;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.left != null) {
            mirrorTree(root.left);
        }

        if (root.right != null) {
            mirrorTree(root.right);
        }

        return root;
    }
}
