import java.io.*;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
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
            int count = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (Q >= arr[i]) {
                    count++;
                    sum += arr[i];
                } else {
                    break;
                }
            }

            System.out.println(count + " " + sum);
        }
    }
}
