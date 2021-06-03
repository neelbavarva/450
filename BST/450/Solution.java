public class Solution {
    static int count = 0;

    static void traverseInOrder(Node root, int l, int h) {
        if (root == null) {
            return;
        }

        traverseInOrder(root.left, l, h);

        if (root.data >= l && root.data <= h) {
            count++;
        }

        traverseInOrder(root.right, l, h);

    }

    int getCount(Node root, int l, int h) {
        count = 0;
        traverseInOrder(root, l, h);
        return count;
    }
}
