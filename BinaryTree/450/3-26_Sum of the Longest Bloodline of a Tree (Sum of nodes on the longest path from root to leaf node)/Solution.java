public class Solution {
    static int maxLen;
    static int maxSum;

    static void traverse(Node root, int sum, int len) {

        if (root == null) {

            if (maxLen < len) {
                maxLen = len;
                maxSum = sum;
            } else if (maxLen == len && maxSum < sum) {
                maxSum = sum;
            }

            return;
        }

        traverse(root.left, sum + root.data, len + 1);
        traverse(root.right, sum + root.data, len + 1);

    }

    public int sumOfLongRootToLeafPath(Node root) {
        if (root == null) {
            return 0;
        }

        maxSum = Integer.MIN_VALUE;
        maxLen = 0;

        traverse(root, 0, 0);

        return maxSum;

    }
}
