public class Solution {

    static int index = 0;

    static void storeInorder(Node node, int inorder[]) {

        if (node == null) {
            return;
        }

        storeInorder(node.left, inorder);

        inorder[index] = node.data;
        index++;

        storeInorder(node.right, inorder);
    }

    static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    static void arrayToBST(int[] arr, Node root) {

        if (root == null) {
            return;
        }

        arrayToBST(arr, root.left);

        root.data = arr[index];
        index++;

        arrayToBST(arr, root.right);
    }

    Node binaryTreeToBST(Node root) {
        if (root == null) {
            return null;
        }

        int n = countNodes(root);

        int arr[] = new int[n];

        index = 0;
        storeInorder(root, arr);

        Arrays.sort(arr);

        index = 0;
        arrayToBST(arr, root);

        return root;
    }
}
