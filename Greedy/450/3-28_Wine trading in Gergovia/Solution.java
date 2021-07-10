import java.io.*;
import java.util.*;

public class Solution {

    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(br.readLine());
        while (true) {
            int arr[] = new int[n];
            String line = br.readLine();
            String[] strs = line.trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }

            List<Pair> buy = new ArrayList<>();
            List<Pair> sell = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    buy.add(new Pair(arr[i], i));
                } else {
                    sell.add(new Pair(arr[i], i));
                }
            }

            int ans = 0;
            int i = 0;
            int j = 0;

            while (i < buy.size() && j < sell.size()) {
                int x = Math.min(buy.get(i).first, -sell.get(j).first);
                buy.get(i).first -= x;
                sell.get(j).first += x;

                int diff = Math.abs(buy.get(i).second - sell.get(j).second);
                ans += (x * diff);

                if (buy.get(i).first == 0) {
                    i++;
                }

                if (sell.get(j).first == 0) {
                    j++;
                }
            }

            output.write(ans + "\n");

            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

        }

        output.flush();

    }

}
