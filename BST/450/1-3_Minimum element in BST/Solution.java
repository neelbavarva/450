class Solution {

    int minValue(Node node) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Node current = node;
        while (current != null) {
            if (current.left == null) {
                min = current.data;
                break;
            } else {
                current = current.left;
            }
        }
        return min;
    }
}
