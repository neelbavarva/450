public class Solution {
    static int count;

    static boolean find(Node root, int value) {
        Node current = root;
        while (current != null) {
            if (value < current.data) {
                current = current.left;
            } else if (value > current.data) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    static void traverseInOrder(Node root1, Node root2, int x) {
        if (root1 == null) {
            return;
        }

        traverseInOrder(root1.left, root2, x);

        int diff = x - root1.data;
        boolean found = find(root2, diff);
        if (found) {
            count++;
        }

        traverseInOrder(root1.right, root2, x);

    }

    public static int countPairs(Node root1, Node root2, int x) {

        count = 0;
        traverseInOrder(root1, root2, x);

        return count;
    }
}
