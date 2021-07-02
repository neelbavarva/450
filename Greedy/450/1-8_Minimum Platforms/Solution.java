public class Solution {
    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int start = 1;
        int end = 0;

        int platforms = 1;

        while (start < n) {
            if (arr[start] > dep[end]) {
                start++;
                end++;
            } else {
                start++;
                platforms++;
            }
        }

        return platforms;

    }
}
