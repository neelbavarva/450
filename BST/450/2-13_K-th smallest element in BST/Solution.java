public class Solution {
    int count = 0;

    public int KthSmallestElement(Node root, int k) {
        if (root == null) {
            return -1;
        }

        int left = KthSmallestElement(root.left, k);

        count++;

        if (count == k) {
            return root.data;
        }

        if (left != -1) {
            return left;
        }

        int right = KthSmallestElement(root.right, k);

        return right;
    }
}
