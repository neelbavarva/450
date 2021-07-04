import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-- > 0) {
            long w = sc.nextLong();
            long h = sc.nextLong();
            long n = sc.nextLong();

            List<Long> listx = new ArrayList<>();
            List<Long> listy = new ArrayList<>();

            listx.add((long) 0);
            listy.add((long) 0);

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                long y = sc.nextLong();

                listx.add(x);
                listy.add(y);
            }

            listx.add(w + 1);
            listy.add(h + 1);

            Collections.sort(listx);
            Collections.sort(listy);

            long maxW = 0;
            long maxH = 0;

            for (int i = 0; i < listx.size() - 1; i++) {
                maxW = Math.max(maxW, listx.get(i + 1) - listx.get(i) - 1);
                maxH = Math.max(maxH, listy.get(i + 1) - listy.get(i) - 1);
            }

            System.out.println(maxH * maxW);

        }
    }

}
