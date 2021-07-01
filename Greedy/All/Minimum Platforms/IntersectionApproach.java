// Question Link : https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
// Execution Time:0.55

import java.io.*;
import java.util.*;

public class IntersectionApproach {

    static int findLargestElement(int dep[]) {

        int max = -1;
        for (int i = 0; i < dep.length; i++) {
            if (dep[i] > max) {
                max = dep[i];
            }
        }
        return max + 1;
    }

    static int findPlatform(int arr[], int dep[], int n) {

        int size = findLargestElement(dep);
        int a[] = new int[size];
        Arrays.fill(a, 0);

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= dep[i]; j++) {
                a[j]++;
            }
        }

        Arrays.sort(a);

        return a[size - 1];
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
