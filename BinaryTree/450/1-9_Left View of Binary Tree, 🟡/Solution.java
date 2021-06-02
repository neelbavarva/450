public class Solution {
    static int max_level = 0;

    public void solve(Node root, ArrayList<Integer> list, int level) {
        if (root == null) {
            return;
        }

        if (max_level < level) {
            list.add(root.data);
            max_level = level;
        }

        solve(root.left, list, level + 1);
        solve(root.right, list, level + 1);
    }

    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        max_level = 0;
        solve(root, list, 1);
        return list;

    }
}
