public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if (image[sr][sc] == newColor) {
            return image;
        }

        solve(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public void solve(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (!(sr >= 0 && sc >= 0 && sr < image.length && sc < image[0].length)) {
            return;
        }

        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
        } else {
            return;
        }

        solve(image, sr + 1, sc, oldColor, newColor);
        solve(image, sr, sc + 1, oldColor, newColor);
        solve(image, sr - 1, sc, oldColor, newColor);
        solve(image, sr, sc - 1, oldColor, newColor);

    }
}
