public class Solution {

    public int solve(Node node) {

        if (node == null) {
            return 0;
        }

        int old_value = node.data;

        node.data = solve(node.left) + solve(node.right);

        return old_value + node.data;
    }

    public void toSumTree(Node node) {
        solve(node);
    }
}
