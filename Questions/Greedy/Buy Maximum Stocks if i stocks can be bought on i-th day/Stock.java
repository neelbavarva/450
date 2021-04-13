// Question Link : https://www.geeksforgeeks.org/buy-maximum-stocks-stocks-can-bought-th-day/

import java.io.*;
import java.util.*;

public class Stock {

    static Map<String, Integer> map = new HashMap<>();

    // Function to sort map by Key
    public static void sortbykey(Map<Integer, Integer> map2) {

        TreeMap<Integer, Integer> sorted = new TreeMap<>();

        sorted.putAll(map2);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i + 1);
        }

        Arrays.sort(arr);
        sortbykey(map);

        int p = 0;

        for (int i = 0; i < n; i++) {
            int noOfPro = map.get(arr[i]);
            p += Math.min(noOfPro, k / arr[i]);
            k = k - arr[i] * Math.min(noOfPro, k / arr[i]);
        }

        System.out.println(p);

    }
}
