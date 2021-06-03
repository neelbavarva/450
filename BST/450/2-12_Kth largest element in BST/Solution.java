public class Solution {
    int count = 0;

    public int kthLargest(Node root, int k) {

        if (root == null) {
            return -1;
        }

        int right = kthLargest(root.right, k);

        count++;

        if (count == k) {
            return root.data;
        }

        if (right != -1) {
            return right;
        }

        int left = kthLargest(root.left, k);

        return left;

    }
}
