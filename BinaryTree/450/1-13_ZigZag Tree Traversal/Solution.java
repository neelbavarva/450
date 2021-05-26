public class Solution {

    ArrayList<Integer> zigZagTraversal(Node node) {
        if (node == null) {
            return null;
        }

        Stack<Node> currLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        currLevel.push(node);

        boolean leftToRight = true;

        while (!currLevel.isEmpty()) {
            Node temp = currLevel.pop();

            if (temp != null) {
                list.add(temp.data);
            }

            if (leftToRight) {
                if (temp.left != null) {
                    nextLevel.push(temp.left);
                }

                if (temp.right != null) {
                    nextLevel.push(temp.right);
                }
            } else {
                if (temp.right != null) {
                    nextLevel.push(temp.right);
                }
                if (temp.left != null) {
                    nextLevel.push(temp.left);
                }
            }

            if (currLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Node> swap = currLevel;
                currLevel = nextLevel;
                nextLevel = swap;
            }
        }

        return list;
    }
}
