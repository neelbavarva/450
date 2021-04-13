// Question Link : https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
// Execution Time:0.45

import java.io.*;
import java.util.*;

public class GreedyApproach {

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

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 6;
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

        System.out.println(findPlatform(arr, dep, n));
    }
}
