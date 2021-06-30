import java.io.*;
import java.util.*;

public class Searching {
    public static int floorElement(int arr[], int x) {

        int ans = -1;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int middle = left + (right - left) / 2;

            if (arr[middle] == x) {
                left++;
            }

            if (arr[middle] > x) {
                right = middle - 1;
                ans = middle;
            }

            if (arr[middle] < x) {
                left = middle + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int q = sc.nextInt();
        for (int o = 0; o < q; o++) {
            int Q = sc.nextInt();
            if (Q > arr[n - 1]) {
                System.out.println(n);
            } else if (Q < arr[0]) {
                System.out.println(0);
            } else {
                System.out.println(floorElement(arr, Q));
            }

        }
    }

}
