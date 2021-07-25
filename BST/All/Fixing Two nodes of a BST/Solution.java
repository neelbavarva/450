import java.util.*;

public class Solution {

    class Node {
        Node left;
        Node right;
        int data;
    }

    static List<Node> list;

    private void traverseInOrder(Node root) {
        if (root == null) {
            return;
        }

        traverseInOrder(root.left);
        list.add(root);
        traverseInOrder(root.right);
    }

    public Node correctBST(Node root) {

        list = new ArrayList<>();

        traverseInOrder(root);

        List<Node> nodeList = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i).data);
        }

        Collections.sort(list2);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).data != list2.get(i)) {
                nodeList.add(list.get(i));
            }
        }

        int temp = nodeList.get(0).data;
        nodeList.get(0).data = nodeList.get(1).data;
        nodeList.get(1).data = temp;

        return root;
    }
}
