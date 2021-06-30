import java.io.*;
import java.util.*;

public class Solution {

    static public boolean solve(int arr[], int n, int p, int mid) {
        int time = 0;
        int paratha = 0;
        for (int i = 0; i < n; i++) {
            time = arr[i];
            int j = 2;
            while (time <= mid) {
                paratha++;
                time += arr[i] * j;
                j++;
            }
            if (paratha >= p) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int p = sc.nextInt();
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int low = 0;
            int high = 100000000;
            int ans = 0;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (solve(arr, n, p, mid)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(ans);

        }

    }

}
