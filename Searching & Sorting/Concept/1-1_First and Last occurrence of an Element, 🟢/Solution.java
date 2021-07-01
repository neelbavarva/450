import java.io.*;
import java.util.*;

public class Solution {
    static public int firstOccurence(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (target < arr[middle]) {
                right = middle - 1;
            } else if (target > arr[middle]) {
                left = middle + 1;
            } else {
                ans = middle;
                right = middle - 1;
            }

        }

        return ans;
    }

    static public int lastOccurence(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (target < arr[middle]) {
                right = middle - 1;
            } else if (target > arr[middle]) {
                left = middle + 1;
            } else {
                ans = middle;
                left = middle + 1;
            }

        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        int arr[] = { 2, 4, 10, 10, 10, 18, 20 };
        System.out.println(firstOccurence(arr, 10));
    }
}
