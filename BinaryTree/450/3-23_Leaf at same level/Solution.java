public class Solution {
    static Set<Integer> set = new HashSet<>();

    void solve(Node root, int count) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            set.add(count);
        }

        solve(root.left, count + 1);
        solve(root.right, count + 1);
    }

    boolean check(Node root) {
        set.clear();
        solve(root, 0);
        if (set.size() == 1) {
            return true;
        }

        return false;
    }
}
