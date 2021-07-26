import java.util.*;

public class Solution {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {

        ArrayList<Integer> list = new ArrayList<>();

        int top = 0;
        int down = r - 1;

        int left = 0;
        int right = c - 1;

        int direction = 0;

        while (left <= right && top <= down) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }

                top++;
            } else if (direction == 1) {
                for (int i = top; i <= down; i++) {
                    list.add(matrix[i][right]);
                }

                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[down][i]);
                }

                down--;
            } else if (direction == 3) {
                for (int i = down; i >= top; i--) {
                    list.add(matrix[i][left]);
                }

                left++;
            }

            direction = (direction + 1) % 4;
        }

        return list;
    }
}
