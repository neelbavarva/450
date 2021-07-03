public class Solution {
    public Node lca(Node root, int n1, int n2) {

        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftNode = lca(root.left, n1, n2);
        Node rightNode = lca(root.right, n1, n2);

        if (leftNode != null && rightNode != null) {
            return root;
        }

        return (leftNode != null) ? leftNode : rightNode;

    }

    int distance(Node root, int key, int count) {
        if (root == null) {
            return -1;
        }

        if (root.data == key) {
            return count;
        }

        int left = distance(root.left, key, count + 1);
        int right = distance(root.right, key, count + 1);

        if (left == -1) {
            return right;
        }

        return left;
    }

    int findDist(Node root, int a, int b) {
        Node anSistor = lca(root, a, b);

        int leftDistance = distance(anSistor, a, 0);
        int rightDistance = distance(anSistor, b, 0);

        return rightDistance + leftDistance;

    }
}
