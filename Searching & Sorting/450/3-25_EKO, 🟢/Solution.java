import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        String line1 = br.readLine();
        String[] strs1 = line1.trim().split(" ");

        long n = Long.parseLong(strs1[0]);
        long m = Long.parseLong(strs1[1]);

        long arr[] = new long[(int) n];

        String line = br.readLine();
        String[] strs = line.trim().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(strs[i]);
        }

        Arrays.sort(arr);

        long low = arr[0];
        long high = arr[(int) n - 1];

        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long cut = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    cut += arr[i] - mid;
                }
            }

            if (cut > m) {
                ans = mid;
                low = mid + 1;
            } else if (cut < m) {
                high = mid - 1;
            } else {
                ans = mid;
                break;
            }
        }

        output.write(ans + "\n");
        output.flush();

    }

}
