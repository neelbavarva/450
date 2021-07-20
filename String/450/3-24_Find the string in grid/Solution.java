import java.util.*;

public class Solution {
    public class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
    static int R, C;

    public boolean solve(char[][] grid, String word, int row, int col) {
        if (grid[row][col] != word.charAt(0)) {
            return false;
        }

        int len = word.length();

        for (int dir = 0; dir < 8; dir++) {

            int k;
            int rd = row + x[dir];
            int cd = col + y[dir];

            for (k = 1; k < len; k++) {
                if (rd < 0 || rd >= R || cd < 0 || cd >= C) {
                    break;
                }

                if (grid[rd][cd] != word.charAt(k)) {
                    break;
                }

                rd += x[dir];
                cd += y[dir];
            }

            if (k == len) {
                return true;
            }
        }

        return false;
    }

    public int[][] searchWord(char[][] grid, String word) {
        R = grid.length;
        C = grid[0].length;

        List<Pair> list = new ArrayList<>();

        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                if (solve(grid, word, row, col)) {
                    list.add(new Pair(row, col));
                }
            }
        }

        int arr[][] = new int[list.size()][2];

        if (list.size() == 0) {
            return arr;
        }

        for (int i = 0; i < list.size(); i++) {
            arr[i][0] = list.get(i).x;
            arr[i][1] = list.get(i).y;
        }

        return arr;
    }

}
