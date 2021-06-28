public class Solution {
    static int index = 0;

    private static int search(int arr[], int strt, int end, int value) {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return i;
    }

    private static Node buildTree(int inorder[], int preorder[], int start, int end) {

        if (start > end) {
            return null;
        }

        int current = preorder[index];
        index++;
        Node node = new Node(current);

        if (start == end) {
            return node;
        }

        int pos = search(inorder, start, end, current);
        node.left = buildTree(inorder, preorder, start, pos - 1);
        node.right = buildTree(inorder, preorder, pos + 1, end);

        return node;
    }

    public static Node buildTree(int inorder[], int preorder[], int n) {
        index = 0;
        return buildTree(inorder, preorder, 0, n - 1);
    }
}
